package InterviewPreparation;

public class Task17 {
    /*int  a = 10;
      int  b  = 20;

    output
    a  20
    b  10

    */

    public   String replace(int a,int b){
       a=a+b;//10+20
       b=a-b;//30-20
       a=a-b;//30-10

        return "a "+a+"\n"+"b "+b;
    }

    public static void main(String[] args) {
        int  a = 10;
        int  b  = 20;

        System.out.println(new Task17().replace(a,b));
    }



}
