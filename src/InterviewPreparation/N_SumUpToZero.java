package InterviewPreparation;

import java.util.ArrayList;

public class N_SumUpToZero {
    public static ArrayList<Integer> TaskThree(int n) {

        if (n < 1) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int add = 0;
        //add elements to list starting with zero and ending with n - 2
        while (n-- > 1) {
            sum += add;//add the number to variable sum
            list.add(add++);
        }
        //multiply sum by -1
        //1,2,3,4 -> sum = 10
        //if we add -10 to 1,2,3,4 then the sum of the 5 numbers is 0
        sum = sum * -1;
        list.add(sum);
        return list;

       // the first number is always 1 and the last number is always the negative value of the sum of numbers already in list
    }

    public static void main(String[] args) {
        System.out.println(TaskThree(5));
    }
}
