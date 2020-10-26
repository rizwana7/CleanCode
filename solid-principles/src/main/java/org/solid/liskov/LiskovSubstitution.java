package org.solid.liskov;

import org.solid.liskov.problem.Square;

public class LiskovSubstitution {
    public static void main(String args[]) {

        System.out.println("Hello World");

        Rectangle r = new Rectangle(1,2);

        System.out.println("Area = " + r.calcArea());

        Square s = new Square(2);

        System.out.println("Area = " + s.calcArea());

    }
}