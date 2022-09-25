package InterviewPreparation;

public class PerfectNumber {
    /*43 Perfect number is the sum of numbers that perfectNum divided by sum
    int perfectNum =28;
eger regeme bolunen regemlerin cemi onun ozune beraberdirse perfect numberdi

     */
    public static boolean perfectNumber(int num){
        int result=0;
        for (int i =1;i<num;i++){
         if (num%i==0){
             result+=i;
         }

        }
        return num==result;
    }

    public static void main(String[] args) {
     int num =28;
        System.out.println(perfectNumber(num));

    }

}
