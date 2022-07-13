package InterviewPreparation;

import java.util.Arrays;

public class Task67 {
    /*
    Combine arrays  int arr1[]={1,2,3};  int arr2[]={4,5,6,7};
    int arr3[]={1,2,3,4,5,6,7};
    */

    public static int[]mergeArray(int[]arr,int[]arr1){
        int[] arr2= Arrays.copyOf(arr,arr.length+arr1.length);
        int count=0;
        for (int i = arr.length; i < arr2.length; i++) {
            arr2[i]=arr1[count++];
        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }
}
