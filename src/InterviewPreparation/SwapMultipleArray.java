package InterviewPreparation;

public class SwapMultipleArray {
    /*
    {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };  output should be
5 4 3 2 1 0 6 9 8 7

     */
    public static String multipleArray(int[][] arr) {
        String reserve = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                reserve+=arr[i][j]+" ";
            }
        }
        return reserve;
    }

    public static void main(String[] args) {
        int[][]arr={  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };
        System.out.println(multipleArray(arr));
    }
}