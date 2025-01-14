package ArrayLists;
import java.util.*;

public class Testing {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        List<Integer> arr1 = new ArrayList<>(arr);
        arr1.set(0,10);
        System.out.println(arr);
        System.out.println(arr1);
        
    }
}
