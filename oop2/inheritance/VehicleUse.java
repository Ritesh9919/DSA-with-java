package oop2.inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "red";
        v.maxSpeed = 30;
        v.print();

        Car c = new Car();
        c.color = "white";
        c.maxSpeed = 30;
        c.numDoors = 4;
        c.print();

        Bicycle b = new Bicycle();
        b.color = "green";
        b.maxSpeed = 20;
        b.print();
    }
}
