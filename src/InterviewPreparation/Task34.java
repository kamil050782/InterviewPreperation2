package InterviewPreparation;

import java.util.Arrays;

public class Task34 {
   /* USE double
    Dont use sort get max  4.5
    String[] arr = {"1","2.5", "3", "3.5", "4.5"};

    output
   4.5
    */

    public static double maxNumber(String[]arr){
        double max=Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            double temp=Double.parseDouble(arr[i]);
            if (temp>max){
                max=temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] arr = {"1","2.5", "3", "3.5", "4.5"};
        System.out.println(maxNumber(arr));
    }
}
