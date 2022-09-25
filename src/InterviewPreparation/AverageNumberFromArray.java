package InterviewPreparation;

public class Task58 {
    /*
    Write a program that can return the average number from an array of
            integers
    ex:
            [10, 15, 5, 6]
    average: 9.0

     */
    public static double averageNumber(int[]arr){
        double result=0;
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i];

        }
        return result/arr.length;
    }

    public static void main(String[] args) {
        int[]arr= {10, 15, 5, 6};
        System.out.println(averageNumber(arr));
    }
}
