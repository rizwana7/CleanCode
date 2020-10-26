package org.solid.liskov.solution;

import org.solid.liskov.Shape;

class Square extends Shape {
    private double side;

    public Square(double s){
        side = s;
    }
    public double calcArea() {
        area = side*side;
        return (area);
    };
}