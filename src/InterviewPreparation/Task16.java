package InterviewPreparation;

public class Task16 {
   /*   USE WHILE LOOP
    int num1=5;
    int num2=2;

    output
    5 divided by 2 is: 2 and remainder is 1
    */
    public static void withoutDivider(int reminder,int divider){

        int count=0;
        int reminder2=reminder;
        while (reminder>=divider){
            count++;
            reminder-=divider;

        }

        System.out.print(reminder2+" divided by "+divider+" is:"+count+" and remainder is "+reminder);

    }
    public static void reminder(int reminder,int divider){
        int count=0;
        System.out.println();
        System.out.print(reminder+" divided by "+divider+" is:");
       for(int i=reminder;i>=divider;i-=divider){
            count++;
           reminder-=divider;


        }

        System.out.print(count+" and remainder is "+reminder);
    }


    public static void main(String[] args) {
        withoutDivider(5,2);
        reminder(100,5);
    }
}
