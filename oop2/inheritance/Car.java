package oop2.inheritance;

public class Car extends Vehicle {
    int numDoors;

    public void print() {
        System.out.println("Car " + "color " + getColor() + " maxSpeed " + maxSpeed + " numDoors " + numDoors);
    }
}
