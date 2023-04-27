package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest extends AnimalTest {

    @Test
    void testMakeNoise1() {
        Animal animal1 = new Bird("Blue", 15, "Hyacinth macaw");

        String noise = animal1.makeNoise();

        assertEquals("singing", noise);
    }

    @Test
    void testGetBirdName() {
        Animal animal1 = new Bird("Blue", 15, "Hyacinth macaw");

        String name = animal1.getName();

        assertEquals("Blue", name);
    }

}