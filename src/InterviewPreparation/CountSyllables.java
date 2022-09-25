package InterviewPreparation;

public class CountSyllables {

    /*Create a function that counts the number of syllables a word has. Each syllable is
    separated with a dash "-" Examples
    numberSyllables("buf-fet") ➞ 2

    String q="buf-dt-rr"; >> 3

     */
    public static int syllables(String str){
       return  str.split("-").length;
//        String[]name=str.split("-");
//        int result=name.length;
//        return result;
    }

    public static void main(String[] args) {
        String q="buf-dt-rr";
        System.out.println(syllables(q));
    }
}
