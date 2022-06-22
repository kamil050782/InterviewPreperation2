package InterviewPreparation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task47 {
    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive
    letters or numbers, sort the individual string and append them back together
    Input:  "D5C01GCCCA098911"
    OutPut: "CD015ACCCG011899"

     */
    public static String sort(String str){
        String[]arr=str.split("");
        Arrays.sort(arr);
        String result="";
        for (String each : arr) {
            result+=each;
        }
        return result;
    }
    public static String splitAndSort(String str){
        String temp="";
        List<String>list=new LinkedList<>();
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            char ch=str.charAt(i);
            char nextCh=str.charAt(i+1);
            if((Character.isLetter(ch) && Character.isLetter(nextCh)) || (Character.isDigit(ch) && Character.isDigit(nextCh))){
                temp+=ch;
            } else if ((Character.isLetter(ch) && Character.isDigit(nextCh)) || (Character.isDigit(ch) && Character.isLetter(nextCh))) {
                temp+=ch;
                list.add(temp);
                temp="";
            } else if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
             return "String should contains only numbers and letters" ;
            }
        }
        if (!temp.isEmpty()){
           temp+=str.charAt(str.length()-1);
           list.add(temp);
        }
//        if (list.size()<str.length()){
//            list.add(str.charAt(str.length()-1)+"");
//        }
        for (String each : list) {
            result+=sort(each);
        }
        return result;
    }

    public static void main(String[] args) {
        String str="D5C01GCCCA098911MV";
        System.out.println(splitAndSort(str));
    }

}
