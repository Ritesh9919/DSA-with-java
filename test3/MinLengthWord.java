package test3;

public class MinLengthWord {

    public static String minLengthWord(String str) {
        String result = "";
        int min = Integer.MAX_VALUE;
        String[] arr = str.split(" ");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() < min) {
                result = arr[i];
                min = arr[i].length();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "My name is Ritesh";
        System.out.println(minLengthWord(str));
    }
}
