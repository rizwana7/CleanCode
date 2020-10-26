package org.solid.liskov;

import org.solid.liskov.Shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double calcArea() {
        area = length * width;
        return (area);
    }

    ;

}
