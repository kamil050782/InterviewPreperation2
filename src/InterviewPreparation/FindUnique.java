package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    /*28  Find unique
    String str = "accabbcd";
    Map<Character, Integer> unique = new HashMap<>();

    output

    {d=1}

     */
    public static Map<Character, Integer> unique(String str) {
        Map<Character, Integer> unique = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count==1){
                unique.put(str.charAt(i),count);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        String str = "accabbcd";
        System.out.println(unique(str));
    }
}
