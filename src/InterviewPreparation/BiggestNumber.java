package InterviewPreparation;

public class BiggestNumber {

    /*if ascend true
    int[]a={1,2,3,9,4,5,6,7};

    output: biggest number 9

    */
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 9, 4, 5, 6, 7};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}