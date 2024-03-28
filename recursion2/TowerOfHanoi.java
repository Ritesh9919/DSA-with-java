package recursion2;

public class TowerOfHanoi {

    public static void towerOfHanoi(int discs, char source, char helper, char destination) {
        if(discs == 0) {
            return;
        }

        if(discs == 1) {
            System.out.println(source + " " + destination);
        }

        towerOfHanoi(discs-1, source,destination,helper);
        System.out.println(source + " " + destination);
        towerOfHanoi(discs-1, helper, source,destination);
    }
    public static void main(String[] args) {
        int discs = 3;
        towerOfHanoi(discs, 'A', 'B', 'C');
    }
}
