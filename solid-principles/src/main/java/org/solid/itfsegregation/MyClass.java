package org.solid.itfsegregation;

import org.solid.itfsegregation.problem.Dog;

public class MyClass {
    public static void main(String args[]) {

        System.out.println("Hello World");

        Dog fido = new Dog();
        fido.eat();
        fido.makeNoise();
    }
}