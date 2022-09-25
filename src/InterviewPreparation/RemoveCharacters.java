package InterviewPreparation;

public class RemoveCharacters {
    public static String removeDash(String str){
        String word="";
       String []result=str.split("-");
       word=result[0]+result[1];

       return word;
    }

    public static void main(String[] args) {
        String str="ABC-DEF";
        System.out.println(removeDash(str));
    }
}
