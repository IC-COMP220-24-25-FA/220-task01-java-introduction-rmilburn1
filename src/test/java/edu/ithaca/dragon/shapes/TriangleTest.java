package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    
    @Test
    public void calcAreaTest(){
        Triangle t = new Triangle(1, 1, 1);
        assertEquals(0.433, t.calcArea(), 0.001);

        t = new Triangle(3, 4, 5);
        assertEquals(6, t.calcArea(), 0.001);

        t = new Triangle(4, 4, 6);
        assertEquals(7.937, t.calcArea(), 0.001);
    }

    @Test
    public void doubleSizeTest(){
        Triangle t = new Triangle(1, 1, 1);
        t.doubleSize();
        assertEquals(1.732, t.calcArea(), 0.001);

        t = new Triangle(3, 4, 5);
        t.doubleSize();
        assertEquals(24, t.calcArea(), 0.001);

        t = new Triangle(4, 4, 6);
        t.doubleSize();
        assertEquals(31.749, t.calcArea(), 0.001);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle t = new Triangle(1, 1, 1);
        assertEquals(1, t.longestLineWithin(), 0.001);

        t = new Triangle(3, 4, 5);
        assertEquals(5, t.longestLineWithin(), 0.001);

        t = new Triangle(4, 4, 6);
        assertEquals(6, t.longestLineWithin(), 0.001);

        t = new Triangle(4, 6, 6);
        assertEquals(6, t.longestLineWithin(), 0.001);
    }
}
