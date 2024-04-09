package oop3.abstractKeyword;

public abstract class Vehicle {
    String color;
    int maxSpeed;

    

    public void print() {
        System.out.println("Vehicle " +  "color " + this.color + " maxSpeed " + this.maxSpeed);
    }

    public abstract boolean isMoterized();
    
}


