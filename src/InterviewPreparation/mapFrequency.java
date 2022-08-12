package InterviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapFrequency {
    /* frequency
    String str="AABBDDDC";
    Map<Character, Integer> map = new LinkedHashMap<>();
    output
    {A=2, B=2, D=3, C=1}

     */
    public static Map<Character, Integer> frequency(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key=str.charAt(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key,1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str="AABBDDDC";
        System.out.println(frequency(str));
    }
}
