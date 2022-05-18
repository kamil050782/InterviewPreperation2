package InterviewPreparation;

public class Task14 {
    /*Use String
    int a=5;

if number is odd output will be odd, if number is even output will be even

     */

    public static String oddEven(int num){
       return num%2==0?"even":"odd";

    }

    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(oddEven(a));
        System.out.println(oddEven(b));
    }

}