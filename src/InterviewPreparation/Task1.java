package InterviewPreparation;

public class Task1 {
  /*  YOU WILL USE 3 WAY TO DO THAT.
            1 WHILE LOOP  2 FOR LOOP AND  3 FOR LOOP by using "FREQUENCY"
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

   */
    public static String frequency(String s){
        String reserve="";
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            char letter=s.charAt(i);
            if (reserve.contains(""+letter)){
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                char eachLetter=s.charAt(j);
                if (eachLetter==letter){
                    count++;
                }

            }
            reserve+=letter+""+count;

        }
        return reserve;
    }

    public static void main(String[] args) {
        String s="AAABBCDD";
        System.out.println(frequency(s));
    }
}
