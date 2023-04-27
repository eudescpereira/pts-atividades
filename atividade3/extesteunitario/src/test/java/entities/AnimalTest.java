package entities;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testMakeNoise1() {
        Animal animal1 = new Animal("Gigi", 12);

        String noise = animal1.makeNoise();

        assertEquals("Noise", noise);
    }

    @Test
    void testGetAnimalName() {
        Animal animal1 = new Animal("Gigi", 12);

        assertEquals("Gigi", animal1.getName());
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

        assertEquals(12, animal1.getAge());
    }
}
