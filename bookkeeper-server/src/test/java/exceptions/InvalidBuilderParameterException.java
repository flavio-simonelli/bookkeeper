package exceptions;

public class InvalidBuilderParameterException extends IllegalTestConfigurationException{
    public InvalidBuilderParameterException(Class<?> builderClass, String paramName, String reason) {
        super(String.format("Builder [%s] invalido. Parametro: '%s'. Motivo: %s", builderClass.getSimpleName(), paramName, reason));
    }
}
