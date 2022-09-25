package InterviewPreparation;

import java.util.Arrays;

public class Alphabet {
    /*
    Output

    Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz
[Aa , Bb , Cc , Dd , Ee , Ff , Gg , Hh , Ii , Jj , Kk , Ll , Mm , Nn , Oo , Pp , Qq , Rr , Ss , Tt ]

     */
    public static String[]alphabet(String str){

        String[]arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+" ";
        }
        return arr;
    }

    public static void main(String[] args) {
        String str="Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz";
        System.out.println(Arrays.toString(alphabet(str)));

    }
}
