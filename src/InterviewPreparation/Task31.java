package InterviewPreparation;

public class Task31 {

     //Given 2 arrays of ints, a and b, return true if
    //they have the same first element or they have the same last element.
    //Both arrays will be length 1 or more.
    public static boolean compareArrays(int[]arr,int[]arr1){
        if (arr[0]==arr1[0] || arr[arr.length-1]==arr1 [arr1.length-1]){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]arr1={1,2,4,8,5};
        System.out.println(compareArrays(arr,arr1));
    }


}
