package InterviewPreparation;

import java.util.Arrays;

public class AscendTrue {

         /*if ascend true
    int[]a={1,2,3,4,5,6,7};
    */
        public static void main(String[] args) {
            int[]a={1,2,3,4,5,6,3};
            int[]b={1,2,3,4,5,6,7};
            Arrays.sort(a);

            System.out.println(Arrays.equals(a, b));
    }
}
