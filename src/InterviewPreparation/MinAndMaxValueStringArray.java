package InterviewPreparation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task65 {
    /*
    String[] arr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};  by using sort Array get max and
    min number

    */
    public static void minAndMax(String[]arr){
        Arrays.sort(arr);
        double max= Double.parseDouble(arr[arr.length-1]);
        double min=Double.parseDouble(arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        String[] arr = {"2.5","1.5", "3", "6.5","3.5", "4.5"};
        minAndMax(arr);
    }

}
