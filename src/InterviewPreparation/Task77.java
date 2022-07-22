package InterviewPreparation;

public class Task77 {
    /*
    String str ="OsOdjjOssh";
    replace "o" with "a" only the number of o is 3 or 4
    asadjjassh <  BECAUSE THERE IS 3 O

     */
    public static String replaceZero(String str){
     int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='O'){
                count++;
            }
        }
        if (count==3 || count==4){
            str=str.replace('O','a');
        }
    return   str;

    }

    public static void main(String[] args) {
        String str ="OsOdjjOssh";
        System.out.println(replaceZero(str));
    }

}
