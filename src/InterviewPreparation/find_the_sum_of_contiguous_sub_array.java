package InterviewPreparation;

public class find_the_sum_of_contiguous_sub_array {

    //Write an efficient program to find the sum of contiguous sub array within a
    // one-dimensional array of numbers which has the largest sum.
// int a[]={ -2, -3, 4, -1, -2, 1, 5, -3};
    //   output 7

    public static int sum(int[] arr) {


        int maxFinal = Integer.MIN_VALUE;
        int maxTemp = 0;
        for (int i = 0; i < arr.length; i++) {
            maxTemp = maxTemp + arr[i];
            if (maxFinal < maxTemp) {
                maxFinal = maxTemp;
            }
            if (maxTemp < 0) {
                maxTemp = 0;
            }
        }
        return maxFinal;

    }

    public static void main(String[] args) {


        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(sum(a));
    }
}