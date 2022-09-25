package InterviewPreparation;

public class Task61 {
    /*
    write a program that can return the number of appearances of
"java" and "python" anywhere in the sentence---"I Like java and javascript not python";
    You will do for each and regular for loop
for each result: java 2
    python 1
     */
    public static void countWords(String str){
        String[] reserve=str.split(" ");
        int javaCount=0;
        int pythonCount=0;
        for (int i = 0; i < reserve.length; i++) {
          if (reserve[i].contains("java")){
              javaCount++;
          }
          if (reserve[i].contains("python")){
              pythonCount++;
          }
        }
        System.out.println("java " + javaCount);
        System.out.println("python " + pythonCount);
    }

    public static void main(String[] args) {
        String str="I Like java and javascript not python";
        countWords(str);
    }
}
