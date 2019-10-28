package lesson3.exceptions;

public class TryCatchExample {

    public static void main(String[] args) {
        String s = "i am not int";

        try {

            Integer integer = cast(s);

        } catch (NumberFormatException exception) {

            exception.printStackTrace();

        }

    }

    public static Integer cast(String s) throws NumberFormatException{
        return Integer.parseInt(s);
    }
}
