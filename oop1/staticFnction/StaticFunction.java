package oop1.staticFnction;

public class StaticFunction {
     public String name;
     private static int numOfStudent;

     public StaticFunction(String name) {
        this.name = name;
        numOfStudent++;
     }

     public static int getNumsOfStudents() {
        return numOfStudent;
     }

    public static void main(String[] args) {
        StaticFunction  sf1 = new StaticFunction("Ritesh");
        StaticFunction  sf2 = new StaticFunction("Rahul");

        System.out.println(StaticFunction.getNumsOfStudents());
    }
}
