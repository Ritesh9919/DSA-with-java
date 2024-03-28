package recursionAssignment;

public class GeometricSum {

    public static double geometricSum(int k) {
        if(k == 0) {
            return 1;
        }

        double smallOutput = geometricSum(k-1);
        double ans = smallOutput + 1/Math.pow(2,k);
        return ans;
    }
    public static void main(String[] args) {
        int k = 3;
        System.out.println(geometricSum(k));
    }
}
