package InterviewPreparation;

public class UniqueLetter {
    public static String uniqueLetters(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i))){
                continue;
            }else {
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String h="AAABBBCCC";
        System.out.println(uniqueLetters(h));
    }
}
