package InterviewPreparation;

import java.util.Arrays;

public class AscendingOrder {
    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */
    
    public static int[]sortArray(int[]arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
               if (arr[i]<arr[j]){
                  int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr={1,9,7,5,7};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
