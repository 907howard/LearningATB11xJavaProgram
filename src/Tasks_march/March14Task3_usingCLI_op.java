package Tasks_march;

public class March14Task3_usingCLI_op {
    public static void main(String[] args) {
        /*using CLI options
        1.Take a user input - Name, Age and Salary and print them in the end

         */
        //1.Take a user input - Name, Age and Salary and print them in the end
        String name = (args[0]);
        int age = Integer.parseInt((args[1]));
        int sal = Integer.parseInt((args[2]));

        System.out.println("your name is "+ name);
        System.out.println("your age is "+ age);
        System.out.println("your name is "+ sal);

        //2.Take a user input 2 numbers from the arguments and..
        // ..calculate the maximum in between with ternary operator
        int num1 = Integer.parseInt((args[3]));
        int num2 = Integer.parseInt((args[4]));

        int max = (num1 > num2) ? num1 : num2;
        System.out.println("maximum of both user inputs is " + max);


    }
}
