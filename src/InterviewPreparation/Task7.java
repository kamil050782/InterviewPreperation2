package InterviewPreparation;

import java.util.Arrays;
import java.util.Collections;

public class Task7 {
    /* String h="AAABBBCCCDEF";
  String result = "";

  output DEF

  */
    public static void main(String[] args) {
        String h="AAABBBCCCDEF";
        String result="";
        for (int i = 0; i < h.length(); i++) {
            int count= Collections.frequency(Arrays.asList(h.split("")),""+h.charAt(i));
            result+=(count==1?h.charAt(i):"");

        }
        System.out.println(result);
    }
}
