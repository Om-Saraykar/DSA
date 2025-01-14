package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void takeStackInput(Stack<Integer> st){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        takeStackInput(st);
        System.out.println(st);

        // reverse stack
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        System.out.println(temp);

        // copy stack
        Stack<Integer> copy = new Stack<>();
        while(temp.size()!=0){
            copy.push(temp.pop());
        }
        System.out.println(copy);
    }
}
