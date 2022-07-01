package InterviewPreparation;

import java.util.*;

public class Task55Maharram {
    public static void main(String[] args) {
        String str = "WWWAAABBBCCDERTTTYYYSSS";
        // ABCDERTYS;
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str2.contains("" + str.charAt(i))) {
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);

        Set<String> set = new TreeSet<>(Arrays.asList(str.split("")));
        System.out.println(set);


        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), 1);
        }
        System.out.println(map.keySet());


        int[] arr = {200, 155, 100, 4, 3, 1, -1, -100};
        //convert it ascending array and print like this
        //[-100, -1, 1, 3, 4, 100, 155, 200]
        int a[] = new int[arr.length];
        int count = 0;
        for (int i = a.length-1; i >= 0; i--) {
            a[count++] = arr[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
