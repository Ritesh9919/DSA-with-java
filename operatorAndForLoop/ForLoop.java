package operatorAndForLoop;

public class ForLoop {
    public static void main(String[] args) {
        // for loop
        // for(int i = 0; i <= 5; i++) {
        //     System.out.println(i);
        // }


        // Variation of for loop

        // for(int i = 1,j=10; i < 5 && j < 15; i++,j++) {
        //     System.out.println(i + " " + j);
        // }

        // for(int i = 1; i < 5; i++) {
        //     for(int j = 1; j < 5; j++) {
        //         System.out.println(i + " " + j);
        //     }
        // }

        // Break keyword

        // for(int i = 1; i <= 5; i++) {
        //     if(i == 3) {
        //         break;
        //     }
        //     System.out.println(i);
        // }


        // for(int i = 1; i < 5; i++) {
        //     for(int j = 1; j < 5; j++) {
        //         if(i == j) {
        //             break;
        //         }
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // Continue keyword

        for(int i = 1; i < 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }

    }
}
