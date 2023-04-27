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

    @Test
    void testSetDogName() {
        Animal animal1 = new Dog("Pandy", 10, "Poodle");

        String name = animal1.setName("pandy");

        assertEquals("pandy", name);
    }

    @Test
    void testGetDogAge() {
        Animal animal1 = new Dog("Pandy", 10, "Poodle");

        int age = animal1.getAge();

        assertEquals(10, age);
    }

    @Test
    void testSetDogAge() {
        Animal animal1 = new Dog("Pandy", 10, "Poodle");

        int age = animal1.setAge(9);

        assertEquals(9, age);
    }

    @Test
    void testGetDogBreed() {
        Dog dog1 = new Dog("Pandy", 10, "Poodle");

        String breed = dog1.getBreed();

        assertEquals("Poodle", breed);
    }

    @Test
    void testSetDogBreed() {
        Dog dog1 = new Dog("Pandy", 10, "Poodle");

        String breed = dog1.setBreed("poodle");

        assertEquals("poodle", breed);
    }
}