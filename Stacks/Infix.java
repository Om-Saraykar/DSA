package Stacks;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> st = new Stack<>();
        Stack<Character> gt = new Stack<>();
        for(char ch: str.toCharArray()){
            // ascii value of 0-9 is 48-57
            if(Integer.parseInt(String.valueOf(ch))>=48 && Integer.parseInt((String.valueOf(ch)))<=57)
                st.push(Integer.parseInt(String.valueOf(ch)));
            else
                if(gt.size()==0) gt.push(ch);
                else{
                    
                }
        }
    }
}
