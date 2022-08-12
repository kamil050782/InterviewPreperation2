package InterviewPreparation;

public class Finra {
    /*
    FINRA
    total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
    print FIN,if num divided by 5 print RA
    */
    public static void finra(int num){

        for (int i=1;i<=num;i++){
            if (i%5==0 && i%3==0 ){
                System.out.print("Finra"+" ");
            } else if (i%3==0) {
                System.out.print("Fin ");
            } else if (i%5==0) {
                System.out.print("Ra ");
            }else {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int num=30;
        finra(num);
    }
}
