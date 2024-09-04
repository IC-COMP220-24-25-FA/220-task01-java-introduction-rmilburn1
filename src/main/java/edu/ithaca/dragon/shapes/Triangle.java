package edu.ithaca.dragon.shapes;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double side1, double side2, double side3) {
        if(side1 >= side2 + side3 || side2 >= side1 + side3 || side3 >= side1 + side2){
            throw new IllegalArgumentException("That's not a triangle! No side may be larger than the other two combined.");
        }
        sideOne = side1;
        sideTwo = side2;
        sideThree = side3;
    }

    public double calcArea(){
        double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
        return java.lang.Math.sqrt(semiPerimeter * (semiPerimeter-sideOne) * (semiPerimeter-sideTwo) * (semiPerimeter-sideThree));
    }

    public void doubleSize(){
        sideOne = sideOne * 2;
        sideTwo = sideTwo * 2;
        sideThree = sideThree * 2;
    }

    public double longestLineWithin(){
        if(sideOne >= sideTwo && sideOne >= sideThree) {
            return sideOne;
        }
        else if(sideTwo >= sideOne && sideTwo >= sideThree){
            return sideTwo;
        }
        else {
            return sideThree;
        }
    }

    public String toString(){
        return "Triangle | side lengths: " + sideOne + ", " + sideTwo + ", " + sideThree;
    }
}
