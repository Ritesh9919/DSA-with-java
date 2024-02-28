package operatorAndForLoop;

public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(a++);
        // System.out.println(b--);
        // System.out.println(++a);
        // System.out.println(--b);

        if(a++ > 10 && b++ > 20) {
            System.out.println("Inside if");
        }else{
            System.out.println("Inside else");
        }

        System.out.println("a:" + a + " b:" + b);
    }
}
