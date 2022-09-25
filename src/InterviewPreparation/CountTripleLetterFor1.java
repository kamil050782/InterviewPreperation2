package InterviewPreparation;

public class Task51 {
    /*
    We'll say that a "triple" in a string is a char appearing three times
    in a row. Print out the number of triples in the given string.
    The triples may overlap. Example:input: abcXXXabc output: 1
     */
    public static int countTriples(String str){
        int count=0;
        if (str.length()>2){
            for (int i = 0; i < str.length()-3; i++) {
                if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str="abcXXXabc";
        System.out.println(countTriples(str));
    }
}
