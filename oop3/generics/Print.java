package oop3.generics;

public class Print {

    public static<T> void print(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1,3,3,2,6,7};
        print(arr1);
        String[] arr2 = {"aa", "bb", "cc"};
        print(arr2);
    }
}
