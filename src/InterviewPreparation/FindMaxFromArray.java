package InterviewPreparation;

public class FindMaxFromArray {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static int maxArray(int[]arr){
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
              max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,59,6};
        System.out.println(maxArray(arr));
    }
}
