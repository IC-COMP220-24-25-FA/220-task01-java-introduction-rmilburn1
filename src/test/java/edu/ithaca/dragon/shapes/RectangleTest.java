package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void doubleSizeTest(){
        Rectangle rect = new Rectangle(3, 4);
        rect.doubleSize();
        assertEquals(48, rect.calcArea(), 0.001);

        rect = new Rectangle(5, 5);
        rect.doubleSize();
        assertEquals(100, rect.calcArea(), 0.001);

        rect = new Rectangle(.5, .5);
        rect.doubleSize();
        assertEquals(1, rect.calcArea(), 0.001);
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(5, rect.longestLineWithin(), 0.001);

        rect = new Rectangle(5, 5);
        assertEquals(7.071, rect.longestLineWithin(), 0.001);

        rect = new Rectangle(.5, .5);
        assertEquals(0.707, rect.longestLineWithin(), 0.001);
    }
}
