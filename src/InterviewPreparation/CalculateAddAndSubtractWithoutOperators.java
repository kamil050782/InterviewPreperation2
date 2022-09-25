package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class CalculateAddAndSubtractWithoutOperators {
    /* USE MAP
    int a=25;
    int b=10;

    you have 2 integers
    and with values assigned
    how would u add them without + sign
            result =35;
    then subtract
    result=15;
     */
    public static void useMap(int num, int num1) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(num, num1);
        int count = 0;
        int min=0;
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            count = Math.addExact(map1.getKey(), map1.getValue());
             min=Math.subtractExact(map1.getKey(),map1.getValue());
        }

        System.out.println(count);
        System.out.println(min);


    }

    public static void main(String[] args) {
        useMap(25,10);

    }
}