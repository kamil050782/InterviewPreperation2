package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRemoveDuplicates {
    /*
    Write a function that can remove the duplicates from an array of integers
     */
    public static int [] removeDuplicates(int[]arr){
        ArrayList<Integer>list=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        int[]result=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[]arr={1,3,3,4,4,5,6,6};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
