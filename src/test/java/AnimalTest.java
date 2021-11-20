import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    public Animal test;
    @BeforeEach
    void setUp() {
        test = new Animal("Coco",2,"brrrt","Tiger");
    }

    @org.junit.jupiter.api.Test
    void giveAnimalLoud() {
        assertEquals("brrrt", test.giveAnimalLoud());
    }

    @org.junit.jupiter.api.Test
    void getNameAndAge() {
        assertEquals("Name: Coco Alter: 2!", test.getNameAndAge());
    }

    @org.junit.jupiter.api.Test
    void ageCategory() {
        assertEquals("baby animal", test.ageCategory());
    }
}