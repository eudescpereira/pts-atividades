package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest extends AnimalTest {

    @Test
    void testMakeNoise1() {
        Animal animal1 = new Dog("Pandy", 10, "Poodle");

        String noise = animal1.makeNoise();

        assertEquals("woof woof", noise);
    }
    @Test
    void testGetDogName() {
        Animal animal1 = new Dog("Pandy", 10, "Poodle");

        String name = animal1.getName();

        assertEquals("Pandy", name);
    }
}