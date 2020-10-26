package org.solid.openclose.solution;

class Rectangle extends Shape
{
    protected double length;
    protected double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    };
    public double getArea() {
        return length*width;
    }

}