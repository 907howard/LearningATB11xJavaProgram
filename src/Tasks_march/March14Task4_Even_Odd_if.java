package Tasks_march;

import java.util.Scanner;

public class March14Task4_Even_Odd_if {
    public static void main(String[] args) {
        //Take a user input 6
        //And check whether the input is even or odd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num  = sc.nextInt();


        if(num%2==0) {
            System.out.println("You entered a even number");
        }
        else
            System.out.println("you entered an odd number");

        }

    }

