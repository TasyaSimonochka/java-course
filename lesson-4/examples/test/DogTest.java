package lesson4.serialize;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DogTest {

    @Test
    public void getName() {
        Dog dog = new Dog();
        dog.name = "sharik";
        assertEquals("sharik",dog.getName());
        assertTrue(dog.getName().equals("sharik"));
        assertFalse(dog.getName().equals("sh"));
    }

    @Test
    @Ignore
    public void setName() {
    }
}