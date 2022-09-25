package InterviewPreparation;

import java.util.Arrays;

public class MoveZeroArray {
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[]moveZeros(int[]arr){
       int[]arr1=new int[arr.length];
       int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
              arr1[count++]=arr[i];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[]arr={9,0,9,0,4,0,8,8,8};
        System.out.println((Arrays.toString(moveZeros(arr))));
    }
}
