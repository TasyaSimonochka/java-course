package lesson3.exceptions;

import java.io.IOException;

public class FinallyTask {
    public static void main(String[] args) {
        exception();
    }

    public static void exception(){
        try{
            try{
                throw new Exception("1");
            } finally {
                if (true) {
                    throw new IOException("2");
                }
                System.err.println("3");
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        } catch (Exception e){
            System.err.println("4");
            System.err.println(e.getMessage());
        }
    }
}
