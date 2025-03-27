package Tasks_march;

import java.util.Scanner;

public class March21Task_Pallindrome {
    public static void main(String[] args) {

        /*
        ✅ Palidrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)
         */
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the setring
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check if the original and reversed strings are the same
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }


    }
