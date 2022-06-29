package InterviewPreparation;

import java.util.Arrays;
import java.util.Collections;

public class Task52 {
    /*
    write a method that can print out the unique elements from an int array

    Ex: {1,1,2,3,3} ==> 2
    {6,6,7,7,8,9} ==> 8 9
            --write a method that can print out the unique elements from a double array
    Note: Apply method overloading
    */
    public static void uniqueElements (Integer[]arr){

        for (int i = 0; i < arr.length; i++) {

          int  count= Collections.frequency(Arrays.asList(arr),arr[i]);
           if (count==1){
               System.out.println(arr[i]);
           }
        }

    }
    public static void uniqueElements(Double[]arr){
        for (int i = 0; i < arr.length; i++) {

            int  count= Collections.frequency(Arrays.asList(arr),arr[i]);
            if (count==1){
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Integer[]arr={1,2,2,3,3,4,4,5};
        Double[]arr2={1.1,2.3,2.0,2.3,2.3};
        uniqueElements(arr);
        uniqueElements(arr2);
    }
}
