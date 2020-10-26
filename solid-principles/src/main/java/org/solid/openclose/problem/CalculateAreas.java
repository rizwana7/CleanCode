package org.solid.openclose.problem;

//this class is closed for extension as it only works for Rectangle object
//According to Open/Close we cant change the class, so modify the design to achieve extension
class CalculateAreas {

    private double area;

    public double calcArea(Rectangle r) {

        area = r.length * r.width;

        return area;

    }
}