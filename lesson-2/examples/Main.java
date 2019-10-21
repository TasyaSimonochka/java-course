package lesson2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

       Animal[] animals = new Animal[2];
       animals[0] = new Cat();
       animals[1] = new Dog();
        for (Animal animal : animals) {
            System.out.println(animal.say());
        }
    }
}
