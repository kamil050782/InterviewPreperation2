package InterviewPreparation;

public class Task41 {
    /*41
    Calculate the power of a number using a while loop

    The power (or exponent) of a number says how many times to use the number in a multiplication.
    It is written as a small number to the right and above the base number.
    */

    public static int calculatePowerOfNumber(int num,int powerNumber){
        int result=1;
        while (powerNumber>=1){
            result*=num;
            powerNumber--;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=3;
        int powerNumber=3;
        System.out.println(calculatePowerOfNumber(num, powerNumber));
    }
}
