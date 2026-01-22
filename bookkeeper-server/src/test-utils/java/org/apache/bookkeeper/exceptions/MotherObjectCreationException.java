package org.apache.bookkeeper.exceptions;

/**
 * Segnala che un <strong>Object Mother</strong> non è riuscito a istanziare una specifica <em>test fixture</em>
 */
public class MotherObjectCreationException extends IllegalTestConfigurationException{

    public MotherObjectCreationException(Class<?> motherClass, String reason) {
        super(String.format("Object Mother [%s] fallito. Motivo: %s", motherClass.getSimpleName(), reason));
    }
}
