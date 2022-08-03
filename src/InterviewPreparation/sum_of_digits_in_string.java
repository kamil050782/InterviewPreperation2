package InterviewPreparation;

public class sum_of_digits_in_string {
    /*String s="1a2b3c4f!@#";
 int sum=0;
 String letter="";
 String digit="";
 String sign="";

 output
  10
  a b c f
  1 2 3 4
  !@#

  */
    public static void main(String[] args) {
        String  s="1a2b3c4f!@#";
        int sum=0;
        String letter="";
        String digit="";
        String sign="";
        for (int i = 0; i < s.length(); i++) {
            char letter1=s.charAt(i);
            if (Character.isDigit(letter1)){
                sum+=Integer.parseInt(letter1+"");
                digit+=letter1;

            } else if (Character.isLetter(letter1)) {
                letter+=letter1+" ";

            }else {
                sign+=letter1+" ";
            }

        }
        System.out.println(sum);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(sign);
    }
}
