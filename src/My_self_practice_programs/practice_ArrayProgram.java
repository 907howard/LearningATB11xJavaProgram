package My_self_practice_programs;

public class practice_ArrayProgram {
    public static void main(String[] args) {


        int[] array = {25, 15, 56, 36, 96, 77, 18, 29, 49};
        //find max in above array
        int i=0;
        int max =array[ i];
       // int min=array [ i];

        for ( i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            //int max =array[i];
            //int min=array[i];
            if(array[i] > max ){
                max = array[i];

            }
            /*
            else{
                min = array[i];
            }


             */


        }
        System.out.println("final max value of array is " + max );
    }
}
