package InterviewPreparation;

public class Task19 {
  /*  1. Write a return method that can verify if a password is valid or not.
      1. Password MUST be at least have 6 characters and should not contain space
      2. PassWord should at least contain one upper case letter
      3. PassWord should at least contain one lowercase letter
      4. Password should at least contain one special characters
      5. Password should at least contain a digit

   */
    public static boolean password(String str){
        int upper=0;
        int lower=0;
        int special=0;
        int digit=0;

        if (str.length()>=6 && !str.contains(" ")){
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))){
                    upper++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    lower++;

                } else if (Character.isDigit(str.charAt(i))) {
                    digit++;

                }else {
                    special++;
                }
            }
            return upper>=1 && lower>=1 && special>=1 && digit>=1;
        }
        return false;
    }

    public static void main(String[] args) {
        String str ="Kamil82@";
        System.out.println(password(str));
    }
}
