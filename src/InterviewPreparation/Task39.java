package InterviewPreparation;

import java.util.Arrays;
import java.util.Random;

public class Task39 {
    /*
    Create 10 random number between 1 and 6

     */
    public static int[]randomNumbers(int num){
        int[]arr=new int [num];
        Random random=new Random();
        for (int i = 0; i < num; ) {
            int temp= random.nextInt(6);
            if (temp>0){
                arr[i]=temp;
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int num=10;
        System.out.println(Arrays.toString(randomNumbers(num)));
    }
}
