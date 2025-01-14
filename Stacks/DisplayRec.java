package Stacks;
import java.util.Stack;

public class DisplayRec {
    public static void displayReverseStack(Stack<Integer> st){
        if(st.isEmpty()) return;
        System.out.print(st.pop() + " ");
        displayReverseStack(st);
    }
    public static void displayStack(Stack<Integer> st){
        if(st.isEmpty()) return;
        int x = st.pop();
        displayStack(st);
        System.out.print(x + " ");
    }
    public static void reverseStackRec(Stack<Integer> stack){
        if(stack.size()==1) return;
        int x = stack.pop();
        reverseStackRec(stack);
        insertAtBottom(stack, x);
    }
    public static void insertAtBottom(Stack<Integer> stack, int x){
        Stack<Integer> temp = new Stack<>();
        while(stack.size()>0){
            temp.push(stack.pop());
        }
        stack.push(x);
        while(temp.size()>0){
            stack.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
//        displayReverseStack(st);
//        displayStack(st);
        System.out.println(st);
        reverseStackRec(st);
        System.out.println(st);
    }
}
