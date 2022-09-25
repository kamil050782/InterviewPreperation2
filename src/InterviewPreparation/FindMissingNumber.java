package InterviewPreparation;

import java.util.ArrayList;

public class FindMissingNumber {
    //40  FIND missing number

    //int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};

    public static void main(String[] args) {
        int r[]={-2,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        ArrayList<Integer> y=new ArrayList<>();

        for(int e=0;e<r.length-1;e++){

            for (int i = r[e] + 1; i < r[e + 1]; i++) {
                y.add(i);
            }
        }

        System.out.println(y);
    }
}
