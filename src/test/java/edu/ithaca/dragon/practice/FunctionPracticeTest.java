package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        // Checks for the correct return value given that the largest integer is the second attribute of the object

        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        // Checks for the correct return value given that the largest integer is the first attribute of the object

        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        // Checks for the correct return value given that the largest integer is the third attribute of the object

        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        // Checks for the correct return value given that all attribute values are equal


        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        // Checks to see if an IllegalArgumentException is thrown when all values are negative

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        // Checks to see if an IllegalArgumentException is thrown when the second attribute is negative

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
        // Checks to see if an IllegalArgumentException is thrown when the third attribute is negative    
    }

    @Test
    public void calcSalePriceTest(){
        fail("Not implemented yet");
    }
    
}
