package InterviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringToMap1 {
     /*
    String s = "Seda, 20, Leyla, 30";

    First output
    {Seda= 20,  Leyla= 30}

    Second
    String str = "Seda, Nurik, Leyla, Seda";
    {Seda=,  Nurik=,  Leyla=,  Seda=}

    */
    public static Map<String,Integer>createMap(String str){
        Map<String,Integer>map=new LinkedHashMap<>();
        String[] name=str.split(", ");
        for (int i = 0; i < name.length; i++) {
            map.put(name[i],Integer.parseInt(name[i+1]));
            i++;
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "Seda, 20, Leyla, 30";
        System.out.println(createMap(s));
    }
}
