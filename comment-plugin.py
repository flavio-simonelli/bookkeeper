import os
import xml.etree.ElementTree as ET
from xml.dom import minidom

def comment_exec_plugins(pom_path):
    with open(pom_path, 'r', encoding='utf-8') as f:
        lines = f.readlines()

    new_lines = []
    inside_plugin = False
    buffer = []
    start_idx = -1
    exec_found = False

    for idx, line in enumerate(lines):
        stripped = line.strip()

        # Start of a plugin
        if not inside_plugin and "<plugin>" in stripped:
            inside_plugin = True
            start_idx = idx
            buffer = [line]
            exec_found = False

        elif inside_plugin:
            buffer.append(line)
            if "<artifactId>exec-maven-plugin</artifactId>" in stripped:
                exec_found = True
            if "</plugin>" in stripped:
                inside_plugin = False
                if exec_found:
                    new_lines.append("<!--\n")
                    new_lines.extend(buffer)
                    new_lines.append("-->\n")
                else:
                    new_lines.extend(buffer)
                buffer = []
        else:
            new_lines.append(line)

    # write back if modified
    if lines != new_lines:
        with open(pom_path, 'w', encoding='utf-8') as f:
            f.writelines(new_lines)
        print(f"✔ Commented exec-maven-plugin in: {pom_path}")
    else:
        print(f"⏭ No exec-maven-plugin found in: {pom_path}")


def walk_and_process(root_dir):
    for root, dirs, files in os.walk(root_dir):
        for file in files:
            if file == 'pom.xml':
                full_path = os.path.join(root, file)
                comment_exec_plugins(full_path)


if __name__ == "__main__":
    import sys
    if len(sys.argv) != 2:
        print("Usage: python comment_exec_plugin.py /path/to/root/project")
    else:
        walk_and_process(sys.argv[1])
