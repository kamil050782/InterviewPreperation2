package InterviewPreparation;

import java.util.Arrays;

public class Anagram {
    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */
    public static boolean anagram(String str,String str1){
        char[]arr=str.toCharArray();
        char[]arr1=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);

       return Arrays.equals(arr, arr1);
    }

    public static void main(String[] args) {
        String str="abc";
        String str1="cba";
        System.out.println(anagram(str,str1));
    }
}
