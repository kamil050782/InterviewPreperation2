package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class Task74_VICTORIAMAHARRAM {
    public static int[]mergeArray(int[]arr, ArrayList<Integer>list){


            int[] result=new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i]=list.get(i);
            }
            for (int i = 0; i < arr.length; i++) {
                result[i]=arr[i]+result[i];
            }

            return result;

    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(4,5,6,7,8));
        System.out.println(Arrays.toString(mergeArray(a, list)));

    }
}
