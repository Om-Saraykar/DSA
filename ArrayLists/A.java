package ArrayLists;
import java.util.*;

public class A {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        list.add(3);
        System.out.println(list);
        HashSet<Integer> seti = new HashSet<>(List.of(1,4,5,8,9));
        seti.add(77);
        seti.add(77);
        seti.add(89);
        System.out.println(seti.contains(10));
        System.out.println(seti);

        LinkedList<Integer> myList = new LinkedList<>(List.of(1,2,3,4,5));
        myList.add(69);
        myList.addFirst(7);
        System.out.println(myList);

        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(10, "habib");
        System.out.println(myMap);
        String str = myMap.get(10);
        System.out.println(str);
    }
}
