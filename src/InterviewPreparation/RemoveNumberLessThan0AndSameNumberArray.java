package InterviewPreparation;

import java.util.ArrayList;

public class RemoveNumberLessThan0AndSameNumberArray {
    /* int y[]=new int[]{6,-6,5,1,2,8};
    Remove all digits that less than 0 and also if that numbers match any number remove that number too
    examp: -6 is less than 0 and also equals 6 . So output should be [5, 1, 2, 8]
    */
    public static ArrayList<Integer> removeDigit(int[] arr) {
        Integer temp = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = -arr[i];
            } else {
                list.add(arr[i]);
                list.remove(temp);
            }


        }

        return list;

    }

    public static void main(String[] args) {

        int[]arr={6,-6,5,1,2,8};
        System.out.println(removeDigit(arr));

    }

}


