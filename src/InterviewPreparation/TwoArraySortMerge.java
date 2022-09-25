package InterviewPreparation;

public class TwoArraySortMerge {
    /*    int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};

    {  {9, 8, 7}, {6},  { { 5,4,3,2,1,0}   };  output should be this
        7 8 9 6 0 1 2 3 4 5
        */
    public static String twoArray(int[][]arr){

        String reverse="";

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i].length - 1; j >= 0; j--) {
                reverse+=arr[i][j]+" ";
            }
        }
        return reverse;
    }

    public static void main(String[] args) {
        int[][] numbers11 = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
        System.out.println(twoArray(numbers11));
    }
}
