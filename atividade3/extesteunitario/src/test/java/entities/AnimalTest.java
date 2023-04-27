package entities;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testMakeNoise1() {
        Animal animal1 = new Animal("Gigi", 12);

        String noise = animal1.makeNoise();

        assertEquals("noise", noise);
    }

    @Test
    void testGetAnimalName() {
        Animal animal1 = new Animal("Gigi", 12);

        String name = animal1.getName();

        assertEquals("Gigi", name);
    }

    @Test
    void testSetAnimalName() {
        Animal animal1 = new Animal("Gigi", 12);

        String name = animal1.setName("gigi");

        assertEquals("gigi", name);
    }

    @Test
    void testGetAnimalAge() {
        Animal animal1 = new Animal("Gigi", 12);

        int age = animal1.getAge();

        assertEquals(12, age);
    }

    @Test
    void testSetAnimalAge() {
        Animal animal1 = new Animal("Gigi", 12);

        int age = animal1.setAge(11);

        assertEquals(11, age);
    }

}
