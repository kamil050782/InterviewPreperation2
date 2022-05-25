package InterviewPreparation;

public class Task23 {
    /* int num=-1234556;
    -6554321
    */
    public static int reverseNumber(int num) {
        String reserve = String.valueOf(num);//String reserve=""+num;
        String result = "";

        if (reserve.charAt(0) == '-') {
            result += reserve.charAt(0);
            for (int i = reserve.length() - 1; i >= 1; i--) {
                result += reserve.charAt(i);

            }
        } else {
            for (int i = reserve.length() - 1; i >= 0; i--) {
                result += reserve.charAt(i);
            }
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        int num=-1234556;
        System.out.println(reverseNumber(num));
    }
}