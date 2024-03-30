package oop1.accessModifier;

public class AccessModifier {
    public String name;
    private int rollNumber;
    int age;
    public static void main(String[] args) {
        AccessModifier ac = new AccessModifier();
        System.out.println(ac.rollNumber);
    }
}
