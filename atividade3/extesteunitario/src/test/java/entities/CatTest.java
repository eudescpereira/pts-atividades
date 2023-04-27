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
        Animal animal1 = new Cat("Freud", 1, "Orange");

        String name = animal1.getName();

        assertEquals("Freud", name);
    }

    @Test
    void testSetCatName() {
        Animal animal1 = new Cat("Freud", 1, "Orange");

        String name = animal1.setName("freud");

        assertEquals("freud", name);
    }

    @Test
    void testGetCatAge() {
        Animal animal1 = new Cat("Freud", 1, "Orange");

        int age = animal1.getAge();

        assertEquals(1, age);
    }

    @Test
    void testSetCatAge() {
        Animal animal1 = new Cat("Freud", 1, "Orange");

        int age = animal1.setAge(2);

        assertEquals(2, age);
    }

    @Test
    void testGetCatColor() {
        Cat cat1 = new Cat("Freud", 1, "Orange");

        String color = cat1.getColor();

        assertEquals("Orange", color);
    }

    @Test
    void testSetCatColor() {
        Cat cat1 = new Cat("Freud", 1, "Orange");

        String color = cat1.setColor("orange");

        assertEquals("orange", color);
    }
}