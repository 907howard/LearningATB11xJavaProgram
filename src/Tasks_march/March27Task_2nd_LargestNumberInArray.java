package Tasks_march;

public class March27Task_2nd_LargestNumberInArray {
    public static void main(String[] args) {

        int[] array = {90, 70, 30, 60, 8, 1};

        int i = 0;

        int max_largest = 0;
        int sec_largest = 0;
        int next = 0;

        for (i = 0; i < array.length; i++) {

            if (array[i] > max_largest) {
                max_largest = array[i];

            }
            //if (sec_highest < max_largest) {
            if (array[i]< max_largest && array[i] > sec_largest ){
               // sec_highest = max_largest;
                sec_largest = array[i];
              System.out.println("2nd highest number in array is " + sec_largest);
            }



            }


            }


    }



