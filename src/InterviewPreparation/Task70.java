package InterviewPreparation;

import java.util.Arrays;

public class Task70 {
    /* Store into Array
    int a[]={1,3,5};
    int b[]={2,4,6};

    output        [1,2,3,4,5,6]
    */
    public static int[]mergeArray(int[]arr,int[]arr1){
        int count=0;
        int[]arr2= new int[arr.length+arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i++]=arr[count];
            arr2[i]=arr1[count];
            count++;
        }
        return arr2;
    }

    public static void main(String[] args) {
        int a[]={1,3,5};
        int b[]={2,4,6};
        System.out.println(Arrays.toString(mergeArray(a, b)));
    }
}
