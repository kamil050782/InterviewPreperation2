package InterviewPreparation;

import java.util.Arrays;

public class Task66 {
  /*
   String [] k = {"bob","joe"};
        String  [] o = {"jones","smith"};

   Complete the combineNames method to return a new String array that
//is composed of the first name and last name of each of the parameters.
//This may be confusing so look at the example:
//first_names = {"bob","joe"}
//last_names = {"jones","smith"}
//returns a new String array with {"bob jones", "joe smith"}
   */
    public static String[]concatArray(String[]arr,String[]arr2){
        if (arr.length== arr2.length){
            String[]result=new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i]=arr[i]+" "+arr2[i];
            }
            return result;
        }
        return null;

    }

    public static void main(String[] args) {
        String[]arr={"bob","joe"};
        String[]arr1={"jones","smith"};
        System.out.println(Arrays.toString(concatArray(arr, arr1)));
    }
}
