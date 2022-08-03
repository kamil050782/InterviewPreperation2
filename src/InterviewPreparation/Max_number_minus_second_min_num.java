package InterviewPreparation;

public class Max_number_minus_second_min_num extends sort_Without_Collections {
    /*Use Collection int a [] = {2,5,7,15,1,6};
     int a [] = {2,5,7,15,1,6};
     output
     13   < Max number minus second min num and result is 13  */
    public static void main(String[] args) {
        Max_number_minus_second_min_num obj = new Max_number_minus_second_min_num();
        int a [] = {2,5,7,15,1,6};
        System.out.println(minisNumAndCalc(a));
    }
    public static int minisNumAndCalc(int[] num){
        sortWithoutCollections(num);
        int result = num[num.length-1] - num[1];
        return result;
    }
}
