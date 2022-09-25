package InterviewPreparation;

public class Factorial {
    public static int factorial(int num){
        int factorial=1;

        for (int i = 1; i <= num; i++) {
            factorial=factorial*i;


        }
        return factorial;
    }

    public static void main(String[] args) {
        int num=5;
        System.out.println(factorial(num));
    }

}
