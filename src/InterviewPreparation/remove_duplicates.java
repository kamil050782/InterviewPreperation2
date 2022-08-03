package InterviewPreparation;

public class remove_duplicates {
    /* String h="AAABBBCCC";
    String result = "";

    output ABC

    */
    public static void main(String[] args) {
        String h="AAABBBCCC";
        String result="";
        for (int i = 0; i < h.length(); i++) {
            if (!result.contains(""+h.charAt(i))){
                result+=h.charAt(i);
            }

        }
        System.out.println(result);
    }
}
