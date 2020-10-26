package org.solid.depinversion.problem.step1;


public class TestMammal {
    public static void main(String args[]) {

        System.out.println("Hello World\n");

        Mammal cat = new Cat();
        Mammal dog = new Dog();

        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dog says " + dog.makeNoise());

    }
}

abstract class Mammal
{
    public abstract String makeNoise();
}
class Cat extends Mammal
{
    public String makeNoise()
    {
        return "Meow";
    }
}
class Dog extends Mammal
{
    public String makeNoise()
    {
        return "Bark";
    }
}