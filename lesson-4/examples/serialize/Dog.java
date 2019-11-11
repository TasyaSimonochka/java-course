package lesson4.serialize;

import java.io.Serializable;

public class Dog implements Serializable {
    String name;

    public Dog() {}

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
