package InterviewPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class Task54 {
    /*
    Ask user enter 5 words and declare long word or Array
    String h[]={"hellow", "whyyyyyyyyyy", "byererdddd", "apple" , "notettttt"};
    */
    public static String[]longArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("How many words do you want enter");
        String[]arr=new String[input.nextInt()];
        int max=0;
        String result="";
        for (int i=0; i<arr.length;i++) {
            System.out.println("Enter your word");
            arr[i]=input.next();
            if (arr[i].length()>max){
                max=arr[i].length();
                result=arr[i];
            }

        }
        System.out.println(result);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(longArray()));
    }
}
