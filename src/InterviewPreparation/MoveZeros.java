package InterviewPreparation;

import java.util.ArrayList;

public class MoveZeros {
    /*12  Move zeros
    int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
    ArrayList<Integer> list = new ArrayList<>();

    output
[1, 2, 3, 49, 6, 5, 0, 0, 0]

    */
    public static ArrayList<Integer>swipeZero(int[]arr){
        ArrayList<Integer>list=new ArrayList<>();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                list.add(arr[i]);
            }else {
                count++;
            }
        }
        for (int i = 0; i <count ; i++) {
            list.add(0);

        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0,2,0,0, 3, 49, 6, 5};
        System.out.println(swipeZero(arr));
    }

}
