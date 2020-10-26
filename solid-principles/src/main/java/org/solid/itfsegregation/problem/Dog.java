package org.solid.itfsegregation.problem;

public class Dog implements IMammal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }
}