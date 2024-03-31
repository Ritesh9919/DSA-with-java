package oop1.staticKeyword;

public class StaticKeyword {
    public String name;
    private int rollNumber;
    static int numOfStudents; // static property belong to class not specifiec object
    public StaticKeyword(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        numOfStudents++;
    }
    public static void main(String[] args) {
        StaticKeyword sk1 = new StaticKeyword("Ritesh", 12);
        StaticKeyword sk2 = new StaticKeyword("Mohan", 14);
        StaticKeyword sk3 = new StaticKeyword("Rahul", 22);
        System.out.println(StaticKeyword.numOfStudents); // you should access static keyword using class name 
    }
}
