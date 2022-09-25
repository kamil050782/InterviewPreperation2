package InterviewPreparation;

public class Palindrome2 {

    /*
    String first="abccba"; < palindrome
    String second="abccbx"; < if it is not palindrome change x to a and make it palindrome
    */
//    public static boolean palindrome(String str){
//       String reverse="";
//        for (int i = str.length()-1; i >= 0; i--) {
//           reverse+=str.charAt(i);
//        }
//        if (str.equals(reverse)){
//            return true;
//        }else {
//            str.charAt(str.length()-1)=str.charAt(0);
//            return false;
//        }
    public static void palindrome(String second){


        if(!second.substring(second.length()-1).equals(second.substring(0,1))){
        second=second.replace(second.substring(second.length()-1),second.substring(0,1));
    }

    String firstPlandrome=new StringBuilder(second).reverse().toString();
    boolean aa=second.equals(firstPlandrome);
        System.out.println(aa);

//    String secondPalindrome="";
//        for(int i=second.length()-1;i>=0;i--){
//        secondPalindrome+=second.charAt(i);
//    }
//
//    boolean isPailndrome=second.equals(secondPalindrome);
//        System.out.println(isPailndrome);
//

        }

    public static void main(String[] args) {
        String second="abcbx";
        palindrome(second);
    }
}
