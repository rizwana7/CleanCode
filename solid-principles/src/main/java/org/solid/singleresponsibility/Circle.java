package org.solid.singleresponsibility;

public class Circle extends Shape{
    private double radius;

    public Circle(double r) {
        radius = r;
    }
    public double calcArea() {
        area = 3.14*(radius*radius);
        return (area);
    };
}