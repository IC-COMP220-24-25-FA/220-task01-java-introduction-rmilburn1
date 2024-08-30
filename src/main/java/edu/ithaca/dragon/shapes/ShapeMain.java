package edu.ithaca.dragon.shapes;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        for(int i=0; i<5; i++){
            Rectangle r = new Rectangle(i, i);
            System.out.println(r.calcArea());
            System.out.println(r.longestLineWithin());
        }       
    }
}
