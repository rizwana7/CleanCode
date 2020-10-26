package org.solid.singleresponsibility.solution;

import org.solid.singleresponsibility.Circle;
import org.solid.singleresponsibility.Shape;

public class TestShape {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Circle circle = new Circle(1);

        Shape[] shapeArray = new Shape[1];
        shapeArray[0] = circle;

        CalculateAreas sum = new CalculateAreas(shapeArray);
        OutputAreas oAreas = new OutputAreas(sum.sumAreas());

        oAreas.console();    // output to console
        oAreas.HTML();       // output to HTML

    }
}