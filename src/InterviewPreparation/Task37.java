package InterviewPreparation;

import java.util.ArrayList;

public class Task37 {
    /* Store Array and ArrayList

    int [] arr = {1,4,8,0,3,11,26,2};

    output
   [1, 8, 3, 26]

     */
    public static ArrayList<Integer>arrayToArraylistWithSkip(int[]arr){
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < arr.length; i+=2) {
            list.add(arr[i]);

        }
        return list;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,8,0,3,11,26,2};
        System.out.println(arrayToArraylistWithSkip(arr));
    }
}
