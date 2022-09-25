package InterviewPreparation;

import java.util.Arrays;

public class AscendDescend {
    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */
    public static int [] descendingArray(int[]arr){
        int temp=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(descendingArray(arr)));
    }
}
