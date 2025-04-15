package Tasks_April.April8thTask;

public class Do_While_Excercise4 {
    public static void main(String[] args) {

        //4️⃣ Calculate sum of first 10 natural numbers
        int i=1;
        int sum=0;
        do {
            sum = sum +i;
           // System.out.println(i);
            System.out.println("Sum of natural numbers is " + sum);
            i=i+1;
        }
        while(i<=10) ;
    }
}
