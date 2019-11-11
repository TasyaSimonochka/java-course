package lesson4.serialize;

import java.io.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Dog dog = new Dog();
        dog.name = "sharik";
        File file = new File("dog.txt");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(dog);
            Dog deserializedDog = (Dog) objectInputStream.readObject();
            System.out.println(deserializedDog.name);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
