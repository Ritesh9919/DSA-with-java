package oop2.inheritanceAndConstructor;

public class Car extends Vehical {
    int numDoors;
    public Car(int numDoors) {
        super("red", 100);
        this.numDoors = numDoors;

    }

    
    public static void main(String[] args) {
        Car c= new Car(4);
        c.print();
    }
}
