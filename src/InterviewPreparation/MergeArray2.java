package InterviewPreparation;

import java.util.Arrays;

public class MergeArray2 {
    /*
    int a[]={1,3,5};
    int b[]={2,4,6};

    output Array
[1, 2, 3, 4, 5, 6]
 */
    public static int[]mergeArray(int[]arr,int[]arr1){

        int[]arr2=new int[arr.length+ arr1.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr2[count++]=arr[i];
            arr2[count++]=arr1[i];
        }
        return arr2;
    }

    public static void main(String[] args) {
        int a[]={1,3,5};
        int b[]={2,4,6};
        System.out.println(Arrays.toString(mergeArray(a, b)));
    }
}
