package InterviewPreparation;

import java.util.Arrays;

public class MergeArray {
    /*
    int a[]={1,3,5};
    int b[]={2,4,6};

    output Array
[1, 2, 3, 4, 5, 6]
 */
    public static int[]mergeArray(int[]arr,int[]arr1,int[]arr2){
        int count=0;
        int[]arr3=new int[arr.length+ arr2.length+arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr3[count++]=arr[i];
            arr3[count++]=arr1[i];
            arr3[count++]=arr2[i];


        }
        return arr3;
    }

    public static void main(String[] args) {
        int a[]={1,4,7};
        int b[]={2,5,8};
        int c[]={3,6,9};
        System.out.println(Arrays.toString(mergeArray(a,b,c)));
    }
}
