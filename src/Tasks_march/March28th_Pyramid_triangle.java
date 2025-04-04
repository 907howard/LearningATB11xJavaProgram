package Tasks_march;

public class March28th_Pyramid_triangle {
    public static void main(String[] args) {

       /* write java program to make Pyramid pattern using 2 dimensional arrays
                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *
        */
//count= 5
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            // Move to next line
            System.out.println();
            }
        }

    }
