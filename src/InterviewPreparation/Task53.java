package InterviewPreparation;

public class Task53 {
    /*
    Write a for loop that will print out the string in alternating cases,
    with the first letter being lowercase
     */
    public static String alternatingCases(String str) {
        String reserve = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                reserve += (str.charAt(i) + "").toLowerCase();
            } else {
                reserve += (str.charAt(i) + "").toUpperCase();
            }
        }
        return reserve;
    }

    public static void main(String[] args) {
        String str = "Maharram";
        System.out.println(alternatingCases(str));
        System.out.println(alternateCase(str));
    }

    public static String alternateCase(String str) {
        String reserve = "";

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
             reserve+=(str.charAt(i)+"").toLowerCase();
            }else {
                reserve+=(str.charAt(i)+"").toUpperCase();
            }
        }
        return reserve;
    }



}
