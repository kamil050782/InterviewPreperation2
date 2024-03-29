package InterviewPreparation;

import java.util.Arrays;

public class MultiplyArrayWithN {

    /*
    I need the solution for an array of size N
    Given an array {a1, a2, a3, … aN}
    New array should be { a2*a3*…aN, a1*a3…aN, … a1*a2…a(N-1)}
    For an example if N=4 and array we have is {2, 3 , 4, 5}
    New array is (3*4*5, 2*4*5, 2*3*5, 2*3*4} = {60, 40, 30, 24}
    */
    public static int[]multiplyArray(int[]arr){
        int[]arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = 0; j < arr.length; j++) {
               if (j!=i){
                   count*=arr[j];
               }
            }
            arr1[i]=count;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[]arr={2, 3 , 4, 5};
        System.out.println(Arrays.toString(multiplyArray(arr)));
    }
}
