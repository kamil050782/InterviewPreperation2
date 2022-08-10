package InterviewPreparation;

public class PrimeNumbersFromKamil {
    //find prime number-divisible only by 1 and by itself
    public static boolean primeNumbers(int num){
      int count=0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                count++;
            }
        }
        return count==2;
    }

    public static void main(String[] args) {
        int num=11;
        System.out.println(primeNumbers(num));
    }
}
