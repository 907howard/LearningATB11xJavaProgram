package Tasks_April.April8thTask;

public class Do_While_Excercise5
{
    public static void main(String[] args) {
        //5️⃣ Print the multiplication table of 7

        int i=1;
        int mul=7;
        int total =0;
        do {
            total = mul * i;
            System.out.println(mul + "*" + i + "=" + total);
            i=i+1;
        }
        while(i<=10) ;



    }
}
