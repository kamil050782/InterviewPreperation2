package InterviewPreparation;

public class CountIntegerInString {
    /*

    String a="aaa10ss20bb30";

    output > 60
    */
    public static int tempNumbers( String str){
        String temp= "0";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                temp+=str.charAt(i);
            }else {
                sum+=Integer.parseInt(temp);
                temp="0";
            }

        }
        return sum+Integer.parseInt(temp);

    }

    public static void main(String[] args) {
        String str="aaa10ss20bb30";
        System.out.println(tempNumbers(str));
    }

}
