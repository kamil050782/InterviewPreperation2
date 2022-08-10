package InterviewPreparation;

import java.util.Arrays;

public class ArraySortFromKamil {
    public static int[]sortArray(int[]arr){

        Arrays.sort(arr);
        return arr;
    }
    public static int[]sortArrayWithoutSortMethod(int[]arr){
        int temp=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
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
        int []arr={1,9,7,9,5};
        int[]arr1={1,9,7,6,5};
       System.out.println(Arrays.toString(sortArray(arr)));
       System.out.println(Arrays.toString(sortArrayWithoutSortMethod(arr1)));
    }

}
