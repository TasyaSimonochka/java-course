package lesson4.javadoc;

import java.io.Serializable;
import java.io.*;

/**
 * @author styopa
 * @version 1.0
 */

public class Dog implements Serializable {
    /**
     * field that stores name of the dog
     */
    String name;

    public Dog() {}

    /**
     * This is constructor
     * @param name
     * @since 1.0
     */

    public Dog(String name) {
        this.name = name;
    }

    /**
     *
     * @return dog`s name
     */
    public String getName() {
        return name;
    }

    /**
     * @deprecated
     * @param name of the dog
     */
    public void setName(String name) throws FileNotFoundException {
        this.name = name;
        FileInputStream fileInputStream = new FileInputStream(new File(""));
    }
}

