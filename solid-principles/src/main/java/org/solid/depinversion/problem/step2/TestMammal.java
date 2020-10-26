package org.solid.depinversion.problem.step2;

public class TestMammal {
    public static void main(String args[]) {

        System.out.println("Hello World\n");

        Mammal cat = new Cat();;
        Mammal dog = new Dog();

        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dog says " + dog.makeNoise());

    }
}

abstract class MakingNoise
{
    public abstract String makeNoise();
}
class CatNoise extends MakingNoise
{
    public String makeNoise()
    {
        return "Meow";
    }
}
class DogNoise extends MakingNoise
{
    public String makeNoise()
    {
        return "Bark";
    }
}
abstract class Mammal
{
    public abstract String makeNoise();
}

class Cat extends Mammal
{
    CatNoise behavior = new CatNoise();
    public String makeNoise()
    {
        return behavior.makeNoise();
    }
}
class Dog extends Mammal
{
    DogNoise behavior = new DogNoise();
    public String makeNoise()
    {
        return behavior.makeNoise();
    }
}