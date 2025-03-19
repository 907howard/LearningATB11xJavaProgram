package Tasks_march;

public class March13_Grade_calculator_task
{
    public static void main(String[] args) {

      /*
        Challenge ; ✅ Grade Calculator:

        Write a program that calculates and displays the letter grade for a
        given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

        A: 90-100

        B: 80-89

        C: 70-79

        D: 60-69

        F: 0-59

       */
/* solve this using ternary operator in simplest way
        //nested ternary:
        /*
        result = condition1 ? expression1: condition? expression2: condition 3 ? expression 3...

        */
        //this example is using CLI
        int score = Integer.parseInt(args[0]);
        System.out.println(score);

      //  String result = (numerical_score >= 90) ? "A" : (numerical_score <= 89) ? "B" : "C";
        String result = (score >= 90) ? "A" : // ->false since we gave score as 64 through CLI
                        (score >= 80) ? "B" : // ->Again false since we gave score as 64 through CLI
                        (score >= 70) ? "D" : // ->Here also false since we gave score as 64 through CLI
                                (score >= 60) ? "D" : "F"    ;

        System.out.println(result);
    }
}
