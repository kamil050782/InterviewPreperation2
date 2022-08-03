package InterviewPreparation;

import java.util.Arrays;

public class ArraySort {
    public static int[] ascOrder(int[] array) {

        int temp = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[]args){
        int[]array = {7,8,1,2,3,4,5};
        System.out.println(Arrays.toString(ascOrder(array)));
    }
}
