package oop2.inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setColor("red");;
        v.maxSpeed = 30;
        v.print();

        Car c = new Car();
        c.setColor("white");
        c.maxSpeed = 30;
        c.numDoors = 4;
        c.printCar();

        Bicycle b = new Bicycle();
        b.setColor("green");
        b.maxSpeed = 20;
        b.print();
    }
}
