package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;

        while (i<j){
            // swap
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        
        System.out.println("Original List : " + list);
        reverseList(list);
        Collections.reverse(list);
        Collections.reverse(list);
        System.out.println("Reversed List : " + list);

        // sorting
        Collections.sort(list);
        System.out.println("Ascending : " + list);

        // reverse sorting
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending : " + list);

    }
}
