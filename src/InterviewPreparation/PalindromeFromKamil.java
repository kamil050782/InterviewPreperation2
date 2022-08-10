package InterviewPreparation;

public class PalindromeFromKamil {
    public static boolean palindrome(String str){
        String reserve="";
        for (int i = str.length()-1; i >= 0; i--) {
           reserve+=str.charAt(i);
        }
           if (str.equalsIgnoreCase(reserve)){
               return true;
           }

           return false;
    }

    public static void main(String[] args) {
        String str="Level";
        System.out.println(palindrome(str));
    }
}
