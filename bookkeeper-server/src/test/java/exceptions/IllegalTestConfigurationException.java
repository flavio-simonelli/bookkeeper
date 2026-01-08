package exceptions;

/**
 * Eccezione base per errori logici nella configurazione dell'ambiente di test.
 * <p>
 * Questa eccezione (e le sue sottoclassi) non indica un bug nel codice di produzione,
 * bensì un errore nel <strong>codice di test</strong> (es. parametri incoerenti passati a un Builder,
 * configurazioni impossibili richieste a un Object Mother o parametri passati ai parametrized test).
 * </p>
 */
public class IllegalTestConfigurationException extends RuntimeException {

    /**
     * Costruisce l'eccezione con un messaggio descrittivo.
     *
     * @param message Il dettaglio dell'errore di configurazione.
     */
    public IllegalTestConfigurationException(String message) {
        super("TEST SETUP ERROR: " + message);
    }

}

