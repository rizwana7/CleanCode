package org.solid.openclose.solution;





public class OpenClosed {
    public static void main(String args[]) {

        System.out.println("Hello World");

        CalculateAreas ca = new CalculateAreas();

        Rectangle r = new Rectangle(1,2);

        System.out.println("Area = " + ca.calcArea(r));

        Circle c = new Circle(3);

        System.out.println("Area = " + ca.calcArea(c));

    }
}