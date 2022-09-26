package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveThreeFromArrayList {
    /*
    ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
    print out
    four five seven
    */
    public static void main(String[] args) {
        ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five", "seven"));
        printElementsFromArray(gg);

    }

    public static void printElementsFromArray(ArrayList<String> list) {

        for (String each : list) {
            for (String eachInner : each.split(","))
                if (!eachInner.equals("three")) {
                    System.out.print(eachInner + " ");
                }
        }
    }
}
