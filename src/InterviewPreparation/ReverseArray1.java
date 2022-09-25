package InterviewPreparation;

public class ReverseArray1 {
    /*
    String sentence = "Today is great day";
    Array [Today, is, great, day]
    reverse Array[Today, is, great, day] to >  day great is Today
    */
    public static String reverseArray(String str){
        String[] reverse=str.split(" ");
        String result="";
        for (int i = reverse.length- 1; i >= 0; i--) {
            result+=reverse[i]+" ";
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence = "Today is great day";
        System.out.println(reverseArray(sentence));
    }
}
