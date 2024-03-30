package oop1.constructors;

public class Constructor {
    public String name;
    private int rollNumber;

    public Constructor(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor() {

    }


    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if(rollNumber <= 0) {
            return;
        }
        this.rollNumber = rollNumber;
    }

    public void print() {
        System.out.println(this.name + " " + this.rollNumber);
    }
    public static void main(String[] args) {
        Constructor s1 = new Constructor("Ritesh", 18);
        Constructor s2 = new Constructor("Mohan");
        Constructor s3 = new Constructor();

        s1.print();
        s2.print();
        s3.print();


    }
}
