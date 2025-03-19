package ex_08_if_Condition;

import java.util.Scanner;

public class Lab082_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //to take input from user instead of using CLI
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);


        if (age > 18) {
            System.out.println("Allowed to vote");
        }
            else{
                System.out.println("You are not allowed to vote");
            }
        }
    }

