package org.solid.itfsegregation.solution;

class Dog implements IEat, IMakeNoise {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }
}