package Tasks_march;

public class March27Task_Odd_Even_Number_In_Array {

    public static void main(String[] args) {

        int[] array = {2, 7, 8, 9, 15};

        int odd = 0;
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = array[i];
                System.out.println("its an even number " + even);
            }
            else {
                odd = array[i];
                System.out.println("Its and odd number " + odd);
            }
        }
    }
}

