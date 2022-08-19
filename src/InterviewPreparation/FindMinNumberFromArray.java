package InterviewPreparation;

public class FindMinNumberFromArray {
    /*
        Write a function that can find the minimum number from an int Array
     */
    public static int minNumber(int[]arr){
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr= {3,6,9,1,8};
        System.out.println(minNumber(arr));
    }
}
