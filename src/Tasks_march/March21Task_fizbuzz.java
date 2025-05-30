package Tasks_march;

public class March21Task_fizbuzz {
    public static void main(String[] args) {
        /*
        ✅ FizzBuzz Test:

        Write a program that prints numbers from 1 to 100. However,
        for multiples of 3, print "Fizz" instead of the number,
        and for multiples of 5, print "Buzz." For numbers that are
        multiples of both 3 and 5, print "FizzBuzz."

        (for loop, if else) ( i%3==0) → 3 , i%5==0 → 5
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz "+ i);
                }
            else if(i % 3 == 0) {
                System.out.println("Fizz " + i);
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz " +i);
            }

        }
        }
    }
