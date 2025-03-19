package ex_03_Java_Basic;

public class Lab_Real_Age_Classification {
    public static void main(String[] args) {

        //age = 23 -> Adult (age > 18) , Minor (age < 18), Senior (age > 65)
        //take input from user using CLI or scanner class etc
//this example is using CLI
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior" ;
        System.out.println(result);
    }
}
