package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        int i, j;
        int n = 6;


        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++)

                System.out.print("* ");

            System.out.println();
        }
    }
}
