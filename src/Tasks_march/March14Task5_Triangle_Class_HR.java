package Tasks_march;

import java.util.Scanner;

public class March14Task5_Triangle_Class_HR {
    public static void main(String[] args) {

//Write a program that classifies a triangle based on its side lengths
        //Given there input values representing the lenght of the sides
        //determine if the triangle is equivalent(all sides are equal)
        //isosceles (exactly two sides are equal)
        //or scalene( no sides are equal)
        //use an if- else statement to classify the triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();

        if (n1==n2 && n2==n3) {

                System.out.printf("You entered same numbers %d %d %d ", n1, n2, n3);
                System.out.println("Its an equilateral triangle");
            }
        else if ((n1!=n2 && n2==n3)) {


                        System.out.printf("You entered 2 same numbers but one different %d %d %d ", n1, n2, n3);
                        System.out.println("Its an isoceles triangle");
                    }

        else {
                    System.out.printf("You entered 3 different numbers %d %d %d ", n1, n2, n3);
                    System.out.println("Its an scalene triangle");
                }

            }

        }



