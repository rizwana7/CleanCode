package org.solid.openclose.solution;

//this is open for extension as it is taking an abstract object rather specific
//one can add any type of shape and calculate its area
class CalculateAreas {
    private double area;

    public double calcArea(Shape s) {
        area = s.getArea();
        return area;
    }
}