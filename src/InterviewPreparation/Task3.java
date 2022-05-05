package InterviewPreparation;

public class Task3 {
    /*3.int a=5;
        int b=6;
        change and print
        a==6;
        b==5;    */

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "A");
        System.out.println(b + "B");


    }
}
