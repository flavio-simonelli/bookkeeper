# Log delle modifiche applicate al progetto per implementare i miei test

1. Creazione del branch dev per lo sviluppo dei miei casi di test. 
   è stato effettuato il branch dal fork del progetto originale così da avere una copia originale del progetto.
2. Eliminazione di tutti i test presenti nel progetto al momento del fork.
Sono stati eliminati semplicemente eliminando tutte le cartelle "test" presenti in ogni modulo del progetto.
Effettuato il run tramite il comando: "mvn clean verify" con skd21 e il build è stato completato con successo.
3. Creazione del file "LOG.md" per tenere traccia delle modifiche che effettuo al progetto.
4. Configurazione del framework Jacoco:
   - Aggiunta della dipendenza Jacoco nel file pom.xml del progetto.
   - Aggiunta del plugin Jacoco nel file pom.xml del progetto.
   - Creazione del modulo "coverage-report" per la generazione del report di copertura. Modificato il file POM per mettere il build di jacoco come fase di build.
   - Aggiunta nel file pom.xml parent per una possibile configurazione di sonarcube (non è necessario)