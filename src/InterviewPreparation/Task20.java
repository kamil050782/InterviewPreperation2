package InterviewPreparation;

public class Task20 {
   /* Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N,
    each on a separate line. However, any number divisible by 2, 3 or 5 should be
    replaced by the word Codility, Test or Coders respectively. If a number is
    divisible by more than one of the numbers: 2,3 or 5, it should be replaced by
    a concatenation of the respective words Codility, Test and Coders in this
    given order. For example, numbers divisible by both 2 and 3 should be
    replacée by CodilityTest and numbers divisible by all three numbers: 2,3
    and 5, should be replaced by CodilityTestCoders.


 1
    Codility
            Test
    Codility
            Coders
    CodilityTest
7
    Codility
            Test
    Codi1ityCoders
11
    CodilityTest
13
    Codility
            TestCoders
    Codility

    */
    public static void codilityTestCoders(int num){
        for (int i = 1; i <= num; i++) {
            if (i%2==0 && i%3==0 && i%5==0){
                System.out.print("CodilityTestCoders ");
            } else if ((i%2==0 && i%3==0 ) || (i%3==0 && i%5==0) ||(i%2==0 && i%5==0)) {
                System.out.print("CodilityTest ");

            } else if (i%2==0 || i%3==0 || i%5==0) {
                System.out.print("Codility ");

            }else {
                System.out.print(i+" ");
            }

        }
    }

    public static void main(String[] args) {
        codilityTestCoders(30);
    }
}
