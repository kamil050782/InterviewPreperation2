package InterviewPreparation;

public class RealInterviewQuestion1 {
     /*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

String str="(([])";

 */
    public static boolean isBalanced(String str){
       while (str.contains("{}") || str.contains("()") || str.contains("[]")){
           str=str.replaceAll("\\[\\]","").replaceAll("\\(\\)","").replaceAll("\\{\\}","");
       }
       return str.isEmpty();
    }

    public static void main(String[] args) {
        String str="()()[[]]";
        System.out.println(isBalanced(str));
    }
}
