package InterviewPreparation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task44 {
    /*44  COMBINE
    int[] a = {1,2};
    int[] b ={3,4};

    output
     [1, 2, 3, 4]

     */
    public static int[]combineArray(int[]a,int[]b){
        int[]sum= Arrays.copyOf(a,a.length+ b.length);//1,8,2,0,0,0
        int count=0;
        for (int i = a.length; i < sum.length; i++) {
           sum[i]=b[count++];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,8,2};
        int[] b ={3,5,4};
        System.out.println(Arrays.toString(combineArray(a,b)));

    }
}
