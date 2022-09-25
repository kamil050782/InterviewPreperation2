package InterviewPreparation;

import java.util.*;

public class Task50 {
    /* Remove from same string assign same string
    String h="AABCC";
    Remove
    SECOND WAY --write a program that can return the unique characters from a string
    Ex:  "AABCC" ==> "B"
     */
    public static String returnUnique(String str){
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(n-> Collections.frequency(list,n)>1);
        return String.valueOf(list);
    }


    public static void main(String[] args) {
        String h="AABCC";
        System.out.println(returnUnique(h));
    }

}
