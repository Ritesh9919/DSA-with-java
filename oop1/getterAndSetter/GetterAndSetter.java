package oop1.getterAndSetter;

public class GetterAndSetter {
    public String name;
    private int rollNumber;

    public int getRollNumber() {
        return rollNumber;
    }

    // public void setRollNumber(int rollNumber) {
    //     if(rollNumber <= 0) {
    //         return;
    //     }
    //     rollNumber = rollNumber;
    // }

    public  void setRollNumber(int rollNumber) {
        if(rollNumber <= 0) {
            return;
        }
        this.rollNumber = rollNumber;
    }
    
}
