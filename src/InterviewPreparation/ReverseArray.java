package InterviewPreparation;

import java.util.Arrays;

/*
 String sentence = "Today is great day";
         Array [Today, is, great, day]
         reverse Array[Today, is, great, day] to >  day great is Today

 */
public class ReverseArray {
    public static String[] reverseArray(String str){
        String[]arr= str.split(" ");
        String[]arr1=new String[arr.length];
        int count=0;
        for (int i = arr.length-1; i >= 0; i--) {
          arr1[count++]=arr[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        String sentence = "Today is great day";
        System.out.println(Arrays.toString(reverseArray(sentence)));
    }

}
