package InterviewPreparation;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task45 {
    /*45
    Find out most repetitive word
    ArrayList<String > fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
            ,"armud","pear","pear","pear","pear","apple","pear","pear"));

     */
    public static String mostRepetitiveWord(ArrayList<String>list){
        int count=0;
        Map<String,Integer>map=new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))){
                count=map.get(list.get(i));
                map.put(list.get(i),count+1);
            }else {
                map.put(list.get(i),1);
            }
        }
        int max=0;
        String result="";
        for(Map.Entry<String,Integer>each:map.entrySet()){
            if (each.getValue()>max){
                max= each.getValue();
                result=each.getKey();
            }

        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String > fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
                ,"armud","pear","pear","pear","pear","apple","pear","pear"));
        System.out.println(mostRepetitiveWord(fruits));
    }
}
