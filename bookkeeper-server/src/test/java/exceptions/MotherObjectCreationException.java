package exceptions;

public class MotherObjectCreationException extends IllegalTestConfigurationException{
    public MotherObjectCreationException(Class<?> motherClass, String reason) {
        super(String.format("Object Mother [%s] fallito. Motivo: %s", motherClass.getSimpleName(), reason));
    }
}
