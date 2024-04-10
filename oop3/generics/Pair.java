package oop3.generics;

public class Pair <T,S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {

    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public static void main(String[] args) {
        // Pair<Integer> p1 = new Pair<Integer>(2, 5);
        // System.out.println(p1.getFirst() + " " + p1.getSecond());

        // Pair<String> p2 = new Pair<String>("Ritesh", "Maurya");
        // System.out.println(p2.first + " " + p2.second);
        // // p2.setFirst(2);
        // p2.setFirst("c");

        // Pair<Character> p3 = new Pair<Character>('a', 'b');
        // System.out.println(p3.first + " " + p3.second);

        // Pair<Double> p4 = new Pair<Double>(2.5, 3.5);
        // System.out.println(p4.first + " " + p4.second);

        Pair<String, Integer>  p5 = new Pair<String,Integer>("aa", 20);
        Pair<Pair<String,Integer>, String> p6 = new Pair<>();
        System.out.println(p6.getSecond());
        p6.setSecond("bb");
        System.out.println(p6.getSecond());
        p6.setFirst(p5);
        System.out.println(p6.getFirst().getFirst());
        System.out.println(p6.getFirst().getSecond());

    
    }
}
