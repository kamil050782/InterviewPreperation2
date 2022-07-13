package InterviewPreparation;

import java.util.Arrays;

public class Task69_Maharram {

    /*
    input
    int g[]={1,2,3};
    int gg[]={4,5,6,7};
    int h[]={8,9};
    int dd[]={10,11};

    output
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

     */
    public static int[] mergeArray(int[] arr, int[] arr1, int[] arr2, int[] arr3) {

        int f[] = Arrays.copyOf(arr, arr.length + arr1.length + arr2.length + arr3.length);

        for (int i = arr.length, m = 0, n = 0, k = 0; i < f.length; i++) {
            if (m < arr1.length) {
                f[i] = arr1[m++];
            } else if (n < arr2.length) {
                f[i] = arr2[n++];
            } else if (k < arr3.length) {
                f[i] = arr3[k++];
            }

        }
        return f;

    }

    public static void main(String[] args) {
        int g[]={1,2,3};
        int gg[]={4,5,6,7};
        int h[]={8,9};
        int dd[]={10,11};
        System.out.println(Arrays.toString(mergeArray(g, gg, h, dd)));
    }
}