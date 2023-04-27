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

    @Test
    void testSetBirdName() {
        Animal animal1 = new Bird("Blue", 15, "Hyacinth macaw");

        String name = animal1.setName("blue");

        assertEquals("blue", name);
    }

    @Test
    void testGetBirdAge() {
        Animal animal1 = new Bird("Blue", 15, "Hyacinth macaw");

        int age = animal1.getAge();

        assertEquals(15, age);
    }

    @Test
    void testSetBirdAge() {
        Animal animal1 = new Bird("Blue", 15, "Hyacinth macaw");

        int age = animal1.setAge(16);

        assertEquals(16, age);
    }

    @Test
    void testGetBirdType() {
        Bird bird1 = new Bird("Blue", 15, "Hyacinth macaw");

        String type = bird1.getType();

        assertEquals("Hyacinth macaw", type);
    }

    @Test
    void testSetBirdType() {
        Bird bird1 = new Bird("Blue", 15, "Hyacinth macaw");

        String type = bird1.setType("hyacinth macaw");

        assertEquals("hyacinth macaw", type);
    }

}