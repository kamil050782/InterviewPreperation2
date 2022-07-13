package InterviewPreparation;

import java.util.Arrays;

public class Task69 {
    /*
    input
    int g[]={1,2,3};
    int gg[]={4,5,6,7};
    int h[]={8,9};
    int dd[]={10,11};

    output
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

     */
    public static int[]mergeArray(int[]arr,int[]arr1,int[]arr2,int[]arr3){
        int count=0;
       int[][]result={arr,arr1,arr2,arr3};
       int[]output=new int[arr.length+arr1.length+arr2.length+arr3.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
              output[count++]=result[i][j];
            }
        }
        return output;

    }

    public static void main(String[] args) {
        int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};
        System.out.println(Arrays.toString(mergeArray(g, gg, h, dd)));
    }
}
