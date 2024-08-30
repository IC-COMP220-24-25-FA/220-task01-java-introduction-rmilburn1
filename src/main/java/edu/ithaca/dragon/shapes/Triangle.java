package edu.ithaca.dragon.shapes;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double side1, double side2, double side3) {
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
}
