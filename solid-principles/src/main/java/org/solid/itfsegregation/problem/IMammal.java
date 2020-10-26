package org.solid.itfsegregation.problem;

//not every mammal can eat or makeNoise
//instead of having 1 interface, have multiple interfaces for each feature
//so that animals implement the interface they have that feature
public interface IMammal {
    public void eat();
    public void makeNoise();
}