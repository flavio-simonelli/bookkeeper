package org.apache.bookkeeper.exceptions;

/**
 * Segnala l'utilizzo di parametri non validi all'interno di un <strong>Fixture Builder</strong>.
 */
public class InvalidBuilderParameterException extends IllegalTestConfigurationException{

    public InvalidBuilderParameterException(Class<?> builderClass, String paramName, String reason) {
        super(String.format("Builder [%s] invalido. Parametro: '%s'. Motivo: %s", builderClass.getSimpleName(), paramName, reason));
    }

    public InvalidBuilderParameterException(String description) {
        super(description);
    }
}
