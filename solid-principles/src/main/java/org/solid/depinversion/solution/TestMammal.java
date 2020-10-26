package org.solid.depinversion.solution;

public class TestMammal {
    public static void main(String args[]) {

        System.out.println("Hello World\n");

        Mammal cat = new Mammal(new CatNoise());
        Mammal dog = new Mammal(new DogNoise());

        System.out.println("Cat says " + cat.makeNoise());
        System.out.println("Dog says " + dog.makeNoise());

    }
}
class Mammal
{
MakingNoise speaker;

    public Mammal(MakingNoise sb)
    {
        this.speaker = sb;
    }
    public String makeNoise()
    {
        return this.speaker.makeNoise();
    }
}
interface MakingNoise
{
    public String makeNoise();
}
class CatNoise implements MakingNoise
{
    public String makeNoise()
    {
        return "Meow";
    }
}
class DogNoise implements MakingNoise
{
    public String makeNoise()
    {
        return "Bark";
    }
}