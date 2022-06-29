package InterviewPreparation;

public class Task50MaharramApproach {
    /* Remove from same string assign same string
    String h="AABCC";
    Remove
    SECOND WAY --write a program that can return the unique characters from a string
    Ex:  "AABCC" ==> "B"
     */
    public static String uniqueLetter(String str){
        String reserve="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;

            for (int j= 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;

                }

            }
            if (count==1){
                reserve+=str.charAt(i);
            }

        }
        return reserve;
    }

    public static void main(String[] args) {
        String h="AABCC";
        System.out.println(uniqueLetter(h));
    }
}
