package InterviewPreparation;

public class Task14WithMaharram {
    public static void  evenOdd(String str){
        String even="";
        String odd="";
        for (int i = 1; i < Integer.parseInt(str); i++) {
            if (i %2==0){
                even+=i+" ";
            }else{
                odd+=i+" ";
            }


        }
        System.out.println(even);
        System.out.println(odd);

    }

    public static void main(String[] args) {
        evenOdd("23");
    }
}
