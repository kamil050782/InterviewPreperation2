package InterviewPreparation;

import java.util.Arrays;

public class ArrReverse {
    /*
    write a function that can reverse an array
     */
    public static int[]reverseArray(int[]arr){
        int count=0;
        int[]arr1=new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[count++]=arr[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
