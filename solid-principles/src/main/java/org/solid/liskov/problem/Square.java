package org.solid.liskov.problem;

import org.solid.liskov.Rectangle;

//this class is trying to mimic rectangle but its violates liskov substitution principle
//square has only one side so it couldn't replace rectangle which has 2 sides
//solution is to remove square as child class and square implement shape
public class Square extends Rectangle {
    public Square(double s) {
        super(s, s);
    }
}
