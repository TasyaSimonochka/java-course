package lesson3.exceptions;

public class ComponentException extends Exception {
    String foo;

    public ComponentException(String message) {
        super(message);
    }

}
