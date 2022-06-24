package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class Task48 {
    /*
    ArrayList<String> d=new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
    How do you find if ArrayList contains duplicates or not?
            (ALSO REMOVE DUPLICATE AT SAME TIME)

     */
    public static ArrayList<String>removeDuplicates(ArrayList<String>list){

        ArrayList<String>list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }

        }
        System.out.println(list1.size()!=list.size()?"Array contains duplicates":"Array does not contains duplicates");
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<String> d=new ArrayList<>(Arrays.asList("A","A","A","A","D","C"));
        System.out.println(removeDuplicates(d));
    }


}
