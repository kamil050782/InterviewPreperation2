package InterviewPreparation;

public class Task15 {

    /* FINRA
     total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
     print FIN,if num divided by 5 print RA
     */
    public static void Finra(int num) {
        String result="";
        for (int i = 1; i <= num; i++) {
            result+=(i%3==0 && i%5==0 )?"FINRA,":(i%3==0)?"FIN, ":(i%5==0)?"RA, ":i+",";

        }
        System.out.println(result.substring(0,result.length()-1));

    }

    public static void main(String[] args) {
        Finra(30);
    }
}