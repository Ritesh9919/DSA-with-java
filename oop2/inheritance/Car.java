package oop2.inheritance;

public class Car extends Vehicle {
    int numDoors;
    int maxSpeed;

    public void print() {
        super.print();
        
        System.out.println("Car " + "color " + getColor() + " maxSpeed " + maxSpeed + " numDoors " + numDoors);
    }
}
