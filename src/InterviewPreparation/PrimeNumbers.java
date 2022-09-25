package InterviewPreparation;

public class Task22PrimeNumbers {
    /*Numbers -- Prime Number. Prime num is a number that divided by itself and 1
      Write a method that can check if a number is prime or not

     */
    public static boolean isPrime(int num){
        int count=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0){
                count++;
            }
        }
        return count==2;
    }

    public static void main(String[] args) {
        int num=3;
        System.out.println(isPrime(num));
    }
}
