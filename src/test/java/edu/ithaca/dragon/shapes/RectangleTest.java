package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaTest(){
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(12, rect.calcArea(), 0.001);

        rect = new Rectangle(5, 5);
        assertEquals(25, rect.calcArea(), 0.001);

        rect = new Rectangle(.5, .5);
        assertEquals(0.25, rect.calcArea(), 0.001);
    }

    public void doubleSizeTest(){
        
    }

    public void longestLineWithinTest(){

    }
}
