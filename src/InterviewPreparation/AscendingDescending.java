package InterviewPreparation;

import java.util.Arrays;

public class AscendingDescending {
    public static void main(String[] args) {
       int[]arr={4,8,9,7,5};

        int temp = 0;
//        int num(i)= 10;
//        int num(c)= 5;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
