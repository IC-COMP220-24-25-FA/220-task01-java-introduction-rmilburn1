package edu.ithaca.dragon.shapes;

public class Circle implements Shape {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double rad){
        if(rad <= 0){
            throw new IllegalArgumentException("Your radius is zero! Try again.");
        }
        this.radius = rad;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return (radius * radius) * 3.14159265;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        radius = radius * 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return radius * 2;
    }

    public String toString(){
        return "Circle | radius: " + radius;
    }
}
