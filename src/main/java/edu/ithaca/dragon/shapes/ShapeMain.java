package edu.ithaca.dragon.shapes;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){
        
        List<Shape> shapeList = new ArrayList<Shape>();
        for (int i=0; i<10; i++) {

            Random rand = new Random();
            int randomGenerator = rand.nextInt(3)+1;

            Shape shape;

            if (randomGenerator == 0) {
                shape = new Circle(rand.nextDouble(20)+1);
            }
            else if (randomGenerator == 1) {
                shape = new Rectangle(rand.nextDouble(20)+1, rand.nextDouble(20)+1);
            }
            else {
                shape = new Triangle(rand.nextDouble(20)+1, rand.nextDouble(20)+1, rand.nextDouble(20)+1);
            }
            shapeList.add(shape);
            System.out.println(shape);
        }

        for (int i=0; i<shapeList.size()-1; i++) {
            shapeList.get(i).doubleSize();
            System.out.println(shapeList.get(i));
        }
        
        /*
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        List<Rectangle> rectList = new ArrayList<Rectangle>();
        for(int i=0; i<5; i++){
            Rectangle r = new Rectangle(i, i);
            rectList.add(r);
            System.out.println("\nRectangle " + (i+1));
            System.out.println(r.calcArea());
            System.out.println(r.longestLineWithin());
        }

        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        Scanner input = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("\nChoose a rectangle (enter a number 1-5): ");
            int selection = input.nextInt();
            rectList.get(selection-1).doubleSize();
            for(int j=0; j<5; j++){
                System.out.println("\nRectangle " + (j+1));
                System.out.println(rectList.get(j).calcArea());
                System.out.println(rectList.get(j).longestLineWithin());
            }
        input.close();
        }
        */

    }
}
