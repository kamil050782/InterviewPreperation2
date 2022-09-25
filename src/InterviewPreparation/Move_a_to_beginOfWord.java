package InterviewPreparation;

public class Move_a_to_beginOfWord {
    /*
    String a="a2b5c7a9f0dafa2s6a8d5a";
    String str="";

     output       aaaaaa2b5c79f0df2s68d5
     */
    public static String moveString(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                result+='a';
             //   str=str.replaceFirst("a","/");

            }
        }
        str=str.replaceAll("a","");
        result+=str;
        return result;
    }

    public static void main(String[] args) {
        String a="a2b5c7a9f0dafa2s6a8d5a";
        System.out.println(moveString(a));
    }
}
