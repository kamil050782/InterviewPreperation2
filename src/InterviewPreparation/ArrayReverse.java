package InterviewPreparation;

import java.util.Arrays;

public class ArrayReverse {
    /*
    write a function that can reverse an array
     */
    public static String[]reverseArray(String[]str){
        String[]str1=new String[str.length];
        int count=0;
        for (int i = str.length - 1; i >= 0; i--) {
            str1[count++]=str[i];
        }
        return str1;
    }

    public static void main(String[] args) {
        String[]str={"We" , "are", "early", "birds"};
        System.out.println(Arrays.toString(reverseArray(str)));
    }
}
