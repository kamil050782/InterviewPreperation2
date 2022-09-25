package InterviewPreparation;

public class CompareStrings {
//     ---WHAT IS OUTPUT----
//    String S1 = "Nisum";
//    String S2 = new String(S1);
//    String S3 ="Nisum";
//        System.out.println((S1.equals(S2)));
//        System.out.println(S1==S2);
//        System.out.println((S3==S1));
public static void main(String[] args) {
    String S1 = "Nisum";
    String S2 = new String(S1);
    String S3 ="Nisum";
       System.out.println((S1.equals(S2)));
      System.out.println(S1==S2);
       System.out.println((S3==S1));
       String S4="";
       String S5=S1+S4;
    System.out.println(S5==S1);


}
}
