package oop2.inheritance;

public class Vehicle {
    private String color;
    protected int maxSpeed;

    public void print() {
        System.out.println("Vehicle" + " color " + this.color + " maxSpeed " + this.maxSpeed);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
