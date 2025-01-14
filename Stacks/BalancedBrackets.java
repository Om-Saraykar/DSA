package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                st.push('(');
            }
            else if(str.charAt(i)==')'){
                if(st.isEmpty())
                    return false;
                else if(st.peek()=='(')
                    st.pop();
            }
        }
        return st.isEmpty();
    }
    public static int removeBrackets(String str){
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                st.push('(');
            }
            else if(str.charAt(i)==')'){
                if(st.isEmpty())
                    count++;
                else if(st.peek()=='(')
                    st.pop();
            }
        }
        return st.size()+count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // balanced or not
        boolean ans = isBalanced(str);
        System.out.println(ans);

        // minimum brackets to be removed
        int x = removeBrackets(str);
        if(x==1) System.out.println(x + "bracket to be removed.");
        else System.out.println(x + " brackets to be removed.");

        // Valid Parenthesis (Leetcode 20)
    }
}
