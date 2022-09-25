package InterviewPreparation;

public class ReverseWithStringBuffer {
    /*42  reverse   USE STRINGBUFFER
    int num = -123;
    -321
    */
    public static int stringBuffer(int num) {
        String temp = "" + num;
        StringBuffer stringBuffer = new StringBuffer();
        if (temp.charAt(0) == '-') {
            stringBuffer.append(temp.charAt(0));
            for (int i = temp.length() - 1; i > 0; i--) {
                stringBuffer.append(temp.charAt(i));
            }
        } else {
            for (int i = temp.length() - 1; i >= 0; i--) {
                stringBuffer.append(temp.charAt(i));
            }

        }
        return Integer.parseInt(String.valueOf(stringBuffer));

    }

        public static void main (String[]args){
            int num = -123;
            System.out.println(stringBuffer(num));
        }

    }
