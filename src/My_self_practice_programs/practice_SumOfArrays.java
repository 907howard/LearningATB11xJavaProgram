package My_self_practice_programs;

public class practice_SumOfArrays {
    public static void main(String[] args) {

        int[] array1 = {4, 1, 6, 5, 3};
        int i =0;
        int sum =0;
        for( i =0; i< array1.length; i++){
            sum = array1[i] +sum;
            System.out.println( array1[i]);
        }
        System.out.println( "Sum of all elements in this array is " + sum);
    }
}
