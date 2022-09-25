package InterviewPreparation;

import java.util.Arrays;

public class Pivot_Int_Inside_Array {
    /*
    int[] arr = {5, 7, 3, 9, 1, 0};
    int pivot = 8
    In case we need to have pivot int inside the array the output should be: [5, 7, 3, 8, 9, 1, 0]

     */
    public static int[]pivot(int[]arr,int num){
       int[]result=new int[arr.length+1];
       int count=0;
        for (int i = 0; i < result.length; i++) {
            if (result.length/2==i){
                result[i]=num;
            }else {
                result[i]=arr[count++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 1, 0};
        int pivot = 8;
        System.out.println((Arrays.toString(pivot(arr, pivot))));
    }
}
