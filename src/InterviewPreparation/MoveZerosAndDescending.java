package InterviewPreparation;

import java.util.Arrays;

public class MoveZerosAndDescending {
    /*
        input
        int[] num21 = {1,2,4,0,0,5,0};
        output
               [5, 4, 2, 1, 0, 0, 0]

               */
    public static int[]moveZerosAndDescending(int[]arr){
        int count=0;
        int[]arr1=new int[arr.length];
        Arrays.sort(arr);//0001245
        for (int i = arr.length - 1; i >= 0; i--) {
           arr1[i]=arr[count++];//542100
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] num21 = {1,2,4,0,0,5,0};
        System.out.println((Arrays.toString(moveZerosAndDescending(num21))));
    }
}
