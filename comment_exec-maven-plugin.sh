#!/bin/bash

# Vai nella root del progetto
cd /home/flaviosimonelli/Project/bookkeeper

# Trova tutti i pom.xml
find . -name "pom.xml" | while read -r pom; do
    echo "Modificando: $pom"

    # Crea un backup
    cp "$pom" "$pom.bak"

    # Commenta le sezioni contenenti exec-maven-plugin
    sed -i '/<plugin>/,/<\/plugin>/ {
        /<artifactId>exec-maven-plugin<\/artifactId>/,/<\/plugin>/ {
            s/^/<!-- /
            s/$/ -->/
        }
    }' "$pom"
done
