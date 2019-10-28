package lesson3.exceptions;

public class ExceptionExample {

    public static void main(String[] args) throws Exception {
        isValid(null);
    }

    public static void exception() throws Exception {
        throw new Exception("this is exception in method");
    }

    public static void isValid(String s) throws Exception {
        if (s == null){
            exception();
        }
    }
}
