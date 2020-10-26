package org.solid.openclose.solution;

class Circle extends Shape
{
    protected double radius;

    public Circle(double r) {
        radius = r;
    };
    public double getArea() {
        return radius*radius*3.14;
    }
}