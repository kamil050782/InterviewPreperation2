package InterviewPreparation;

import java.util.Arrays;

public class Task11 {
   /* if disc  true
    int[]a={7,6,5,4};
     */
   public static void main(String[] args) {
       int[]a={7,6,5,4};
       int[]b={7,6,5,4};
       int[]c=new int[4];
       Arrays.sort(a);
       int count=0;
       for (int i = a.length-1; i >= 0; i--) {
           c[count]=a[i];
           count++;


       }
       System.out.println(Arrays.toString(c));
       System.out.println(Arrays.equals(b,c));
   }


}
