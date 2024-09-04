package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double len, double wid){
        if (len <= 0 || wid <= 0){
            throw new IllegalArgumentException("One of your values is zero! Try again.");
        }
        
        this.length = len;
        this.width = wid;
    }

    public double calcArea(){
       return length * width;
    }

    public void doubleSize(){
        this.length = this.length * 2;
        this.width = this.width * 2;
    }

    public double longestLineWithin(){
        double longestLine = java.lang.Math.sqrt((length * length) + (width * width));
        return longestLine;
    }
    
    public String toString(){
        return "Rectangle | length: " + length + " | width: " + width;
    }
}
