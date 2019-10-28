package lesson3.exceptions;

import java.io.*;

public class Component {

    public static void main(String[] args) {
        String s = "i am not int";

        try {

            Integer integer = parse(s);

        } catch (ComponentException e) {

            e.printStackTrace();

        }

    }

    public static Integer parse(String s) throws ComponentException {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e){
            throw new ComponentException("component exception");
        }
    }



    public static void open(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            //do something
        }
    }

}
