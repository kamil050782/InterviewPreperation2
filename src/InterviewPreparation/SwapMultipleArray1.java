package InterviewPreparation;

public class Task64 {
    /*
    {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };    output should be
0 1 2 3 4 5 6 7 8 9

     */
    public static String multipleArray(int[][]arr){
        String reserve="";
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
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
