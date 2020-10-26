package org.solid.openclose.problem;



public class OpenClosed {
    public static void main(String args[]) {

        System.out.println("Hello World");

        Rectangle r = new Rectangle(1,2);

        CalculateAreas ca = new CalculateAreas ();

        System.out.println("Area = "+ ca.calcArea(r));

    }
}