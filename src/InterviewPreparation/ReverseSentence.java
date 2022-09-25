package InterviewPreparation;

public class ReverseSentence {
    /*
    String sentence = "Today is great day";
    yad taerg si yadoT
    */

    public static String reverseSentence(String str){
        String reverse="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse+" ";
    }

    public static void main(String[] args) {
        String sentence = "Today is great day";
        System.out.println(reverseSentence(sentence));
    }
}
