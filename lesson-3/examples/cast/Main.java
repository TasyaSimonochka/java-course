package lesson3.cast;

import lesson2.computer.Computer;
import lesson2.computer.Laptop;

public class Main {
    public static void main(String[] args) {
        int i = 1000000;

        String binary = Integer.toBinaryString(i);

        int b = Integer.parseInt(binary.substring(binary.length()-15),2);
        System.out.println("int from binary: "+b);

        short sh = (short) i;
        System.out.println("this is short from int: "+sh);

        Computer computer = new Laptop();
        Object o = new Object();
    }
}
