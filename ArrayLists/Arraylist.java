package ArrayLists;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();

        // add new element
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        // get an element at index i
        System.out.println("Element at index 3 is : " + list1.get(3));

        // print with for loop
            // regular for loop
            for(int i=0; i<list1.size(); i++){
                System.out.print(list1.get(i)+ " ");
            }
            // enhanced for loop
            for (Integer num : list1) {
                System.out.print(num + " ");
            }
            System.out.println("\n");

        // print the array list directly
        System.out.println(list1);

        // adding element at index i
        list1.add(2,69);
        System.out.println(list1);

        // removing an element at index i
        list1.remove(2);
        System.out.println(list1);

        //checking if an element exist
        System.out.println(list1.contains(3));

        // if you don't specify class, you can add anything :)
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add(34);
        System.out.println(list2);

        System.out.println();
        System.out.println();
        ArrayList<Integer> noice = new ArrayList<>(6);
        noice.add(3);
        noice.add(143);
        System.out.println(noice);
        System.out.println(noice.size());

    }
}