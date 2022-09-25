package InterviewPreparation;

import java.util.Arrays;

public class Task13 {
   /* 13
    int arr1[]={1,2,3};
    int arr2[]={4,5,6,7};

    output
     [1, 2, 3, 4, 5, 6, 7]

    */
    public static int[]mergeArray(int[]arr1,int[]arr2){

        int[]arr= Arrays.copyOf(arr1,arr1.length+ arr2.length);
        int count=0;
        for (int i = arr1.length; i < arr.length; i++) {
            arr[i]=arr2[count++];

        }

        return arr;
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};
        System.out.println(Arrays.toString(mergeArray(arr1,arr2)));
    }
}
