package InterviewPreparation;

import java.util.Arrays;

public class Delta {
    //int arrray contains dup valueas [1,2,3,2,3,4]

    public static int[]removeDuplicate(int[]arr){
        int temp=0;
        int[]arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){

                }else {

                }
            }

    }
      return arr1;

    }

    public static void main(String[] args) {
        int[]arr={1,2,3,2,3,4};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
}
