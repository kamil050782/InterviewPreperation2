package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveThreeFromArrayList {
    /*
    ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
    print out
    four five seven
    */
    public static String removeThree(ArrayList<String>list){
        String result="";
        for (int i = 0; i < list.size(); i++) {
            if (i==0){
                String[]arr=list.get(i).split(",");
                result+=arr[i]+" ";
            }else {
                result+=list.get(i)+" ";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
        System.out.println(removeThree(gg));
    }
}
