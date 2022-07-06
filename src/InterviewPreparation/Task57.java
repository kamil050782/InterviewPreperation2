package InterviewPreparation;

public class Task57 {
    /*
    Given an array nums with 7 integers every element is repeated twice
 - except one. Find that element and print it to console.
    Example:
    nums -> [1, 1, 2, 3, 4, 3, 4]
            2
            */
    public static int uniqueNumber(int[]arr){
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
              if (arr[i]==arr[j]) {
                  count++;
              }
            }
            if (count==1){
                return arr[i];
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        int[]arr={1, 1, 2, 3, 4, 3, 4};
        System.out.println(uniqueNumber(arr));
    }
}
