package InterviewPreparation;

public class Task49 {
    /*
 write a program which prints out the numbers from 1 to 30:
            for numbers which are divisible by 3, print "FIN" instead of the number.
            for numbers which are divisible by 5, print "RA" instead of the number
for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number

     */
    public static void finRa(int num){

        for (int i = 1; i <=num; i++) {
          if (i%5==0 && i%3==0){
              System.out.print(" FINRA ");
          } else if (i%5==0) {
              System.out.print(" RA ");
          }else if( i%3==0){
              System.out.print(" FIN ");

          }else {
              System.out.print(" "+i );
          }
        }

    }

    public static void main(String[] args) {
        int num=30;
        finRa(num);
    }



    }


