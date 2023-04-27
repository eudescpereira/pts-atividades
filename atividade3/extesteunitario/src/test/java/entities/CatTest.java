package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest extends AnimalTest {

    @Test
    void testMakeNoise1() {
        Animal animal1 = new Cat("Freud", 1, "Orange");

        String noise = animal1.makeNoise();

        assertEquals("meow meow", noise);
    }

    @Test
    void testGetCatName() {
        Animal animal1 = new Bird("Freud", 1, "Orange");

        String name = animal1.getName();

        assertEquals("Blue", name);
    }
}