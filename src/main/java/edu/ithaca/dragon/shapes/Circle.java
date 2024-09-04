package edu.ithaca.dragon.shapes;

public class Circle {
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
        this.radius = this.radius * 1.414;
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
