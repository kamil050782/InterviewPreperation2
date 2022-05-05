package InterviewPreparation;

public class Task4 extends Task5{
    /*Use Collection int a [] = {2,5,7,15,1,6};
     int a [] = {2,5,7,15,1,6};
     output
     13   < Max number minus second min num and result is 13  */
    public static void main(String[] args) {
        Task4 obj = new Task4();
        int a [] = {2,5,7,15,1,6};
        System.out.println(minisNumAndCalc(a));
    }
    public static int minisNumAndCalc(int[] num){
        sortWithoutCollections(num);
        int result = num[num.length-1] - num[1];
        return result;
    }
}
