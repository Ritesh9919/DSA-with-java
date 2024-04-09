package oop3.interfaces;

public class Car extends Vehicle implements VehicleInterface,CarInterface{
    @Override
    public String getCpmpany() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isMoterized() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int numGears() {
        // TODO Auto-generated method stub
        return 5;
    }
}
