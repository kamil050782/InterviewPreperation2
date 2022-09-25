package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveMoreThan100 {
    /*25 USE ITERATOR
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

    output
   [1, 2, 3, 4, 5, 6, 7, 8, 9]
   */
    public static ArrayList<Integer>removeMoreThanHundredNumbers(ArrayList<Integer>list){
        Iterator<Integer>it=list.iterator();
        while (it.hasNext()){
            if (it.next()>100){
                it.remove();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        System.out.println(removeMoreThanHundredNumbers(list1));
//        list1.removeIf(n->n>=100); we can use this method also
//        System.out.println(list1);

    }
}
