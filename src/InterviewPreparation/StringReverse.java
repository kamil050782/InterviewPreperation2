package InterviewPreparation;

public class StringReverse {
    public static String reverseWord(String str){
        String reserve="";
        for (int i = str.length()-1; i >= 0; i--) {
            reserve+=str.charAt(i);
        }
        return reserve;
    }

    public static void main(String[] args) {
        String str="Maharram";
        System.out.println(reverseWord(str));
    }
}
