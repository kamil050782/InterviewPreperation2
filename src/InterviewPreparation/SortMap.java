package InterviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
   /* SORT MAP

    Map<String, Integer> map=new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);

    */
   public static TreeMap<String,Integer>sortMap(Map<String,Integer>map){
       TreeMap<String,Integer>sort=new TreeMap<>(map);

      return sort;
   }

    public static void main(String[] args) {
        Map<String, Integer> map=new LinkedHashMap<>();
        map.put("Ilham",30);
        map.put("Kenan",20);
        map.put("Solmaz",10);
        map.put("Venera",40);
        map.put("Orxan",70);
        map.put("Sada",60);
        map.put("Esmira",50);
        map.put("Ramil",80);
        System.out.println(sortMap(map));
    }

}
