package Stacks;
import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(27);
        st.push(69);
        System.out.println(st);
        st.add(37); // not commonly used
        st.add(1,3);
        System.out.println(st);
    }
}
