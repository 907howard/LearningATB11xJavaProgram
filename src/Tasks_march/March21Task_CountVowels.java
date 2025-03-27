package Tasks_march;

import java.util.Scanner;

public class March21Task_CountVowels {
    public static void main(String[] args) {
        /*
        ✅ Count vowels(a,e,i,o,u) and consonants in a String.
         → pramod, → vowels - 2, consonants - 4

         */
                Scanner scanner = new Scanner(System.in);

                // Input from user
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                int vowels = 0, consonants = 0;
                input = input.toLowerCase(); // Convert to lowercase for easy comparison

                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);

                    // Check if character is a letter
                    if (ch >= 'a' && ch <= 'z') {
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            vowels++;
                        } else {
                            consonants++;
                        }
                    }
                }

                // Display results
                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);

                scanner.close();
            }
        }
