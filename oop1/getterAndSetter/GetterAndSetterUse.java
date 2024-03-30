package oop1.getterAndSetter;

public class GetterAndSetterUse {
    public static void main(String[] args) {
        GetterAndSetter gs = new GetterAndSetter();
        System.out.println(gs.getRollNumber());
        gs.setRollNumber(10);
        System.out.println(gs.getRollNumber());
    }
}
