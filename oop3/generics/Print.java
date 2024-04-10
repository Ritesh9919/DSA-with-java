package oop3.generics;

public class Print {

    public static<T extends PrintInterface> void printArray(T arr[]) {
        for(int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
    }
    public static void main(String[] args) {
        // Integer[] arr1 = {1,3,3,2,6,7};
        // printArray(arr1);
        // String[] arr2 = {"aa", "bb", "cc"};
        // printArray(arr2);

        Vehicle arr3[] = new Vehicle[5];
        for(int i = 0; i < arr3.length; i++) {
            arr3[i] = new Vehicle(50, "BMW");
        }
        printArray(arr3);
    }
}
