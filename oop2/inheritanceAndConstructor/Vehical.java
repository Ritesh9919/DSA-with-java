package oop2.inheritanceAndConstructor;

public class Vehical {
    String color;
    int maxSpeed;

    public Vehical(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Vehicle " + "color " + this.color + " maxSpeed " + this.maxSpeed);
    }
}
