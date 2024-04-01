package oop1.dynamicArrayClass;

public class DynamicArray {
    private int[] data;
    private int nextElementIndex;

    public DynamicArray() {
        data = new int[5];
        nextElementIndex = 0;
    }

    public int size() {
        return nextElementIndex;
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public int get(int i) {
        if(i >= nextElementIndex) {
            // throw error
            return -1;
        }

        return data[i];
    }

    public void add(int element) {
        if(nextElementIndex == data.length) {
            doubleCapacity();
        }
        data[nextElementIndex] = element;
        nextElementIndex++;
    }

    public void doubleCapacity() {
        int temp[] = data;
        data = new int[temp.length * 2];
        for(int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public void set(int index, int element) {
        if(index >= nextElementIndex) {
           return;
        }
          data[index] = element;
    }

    public int removeLast() {
        if(nextElementIndex == 0) {
            // throw error
            return -1;
        }
        int temp = data[nextElementIndex-1];
        data[nextElementIndex-1] = 0;
        nextElementIndex--;
        return temp;
    }

   
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        for(int i = 1; i < 100; i++) {
            d.add(100 + i);
        }
        // System.out.println(d.size());
        // System.out.println(d.removeLast());
        // System.out.println(d.size());
        // System.out.println(d.isEmpty());

        

       
    }
}
