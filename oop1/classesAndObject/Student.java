package oop1.classesAndObject;

public class Student {
    String name;
    int rollNumber;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Ritesh";
        s1.rollNumber = 12;
        s2.name = "Pawan";
        s2.rollNumber = 32;
        System.out.println(s1.name + " " +  s1.rollNumber);
        System.out.println(s2.name + " " +  s2.rollNumber);

    }
}
