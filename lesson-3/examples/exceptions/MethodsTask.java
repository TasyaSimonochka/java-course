package lesson3.exceptions;

import java.io.IOException;

public class MethodsTask {

    public static void m1() throws Exception, IllegalArgumentException {
        m2();
        throw new Exception();
    }

    public static void m2() throws IllegalArgumentException{
        m3();
    }

    public static void m3() throws IllegalArgumentException{
        try {
            m4();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m4() throws IOException,IllegalArgumentException{
        m5();
    }

    public static void m5() throws IOException{
        if (true){
            throw new IllegalArgumentException();
        }
        throw new IOException();
    }

    public static void main(String[] args) throws Exception {
        try {
            m1();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }
}
