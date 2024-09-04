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
        assertEquals(80.0, FunctionPractice.calcSalePrice(100.0, 20.0, 0));
        // Checks if discount is applied to originalPrice properly

        assertEquals(105.0, FunctionPractice.calcSalePrice(100.0, 0, 5.0));
        // Checks if sales tax is applied to originalPrice properly

        assertEquals(94.5, FunctionPractice.calcSalePrice(100.0, 10, 5.0));
        // Checks if discount and tax are applied to originalPrice properly in that order

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(0, 0, 0));
        // Ensures originalPrice cannot be less than or equal to zero

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(-1, 0, 0));
        // Ensures originalPrice cannot be less than or equal to zero

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(10, -1, 0));
        // Ensures discountPercent cannot be less than zero

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.calcSalePrice(10, 0, -1));
        // Ensures salesTax cannot be less than or equal to zero
    }

    @Test
    public void isGoodDogTest(){
        assertTrue(FunctionPractice.isGoodDog(1, 8, false));
        // Checks if function returns true if daysSinceShoesChewed > 7

        assertFalse(FunctionPractice.isGoodDog(1, 6, false));
        // Checks if function returns false if daysSinceShoesChewed < 7

        assertTrue(FunctionPractice.isGoodDog(1, 4, true));
        // Checks if function returns true if daysSinceShoesChewed < 7 but fetchedThePaper is true

        assertTrue(FunctionPractice.isGoodDog(1, 8, true));
        // Checks if function returns true if both daysSinceShoesChewed and fetchedThePaper conditions are met
        
    }
    
}
