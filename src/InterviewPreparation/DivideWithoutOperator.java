package InterviewPreparation;

public class DivideWithoutOperator {
    /*
    don't use divide operator
    int a=11;
    int b=2;
    divide a by b and result is =5
    reminder =1
    */
    public static void divideWithoutOperator (int num, int num2){
        int result=0;
       while (num>num2){
           num-=num2;
           result++;
       }
        System.out.println(result);
        System.out.println(num);
    }

    public static void main(String[] args) {
        divideWithoutOperator(11,2);
    }
}
