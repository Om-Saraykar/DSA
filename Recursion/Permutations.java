package Recursion;

public class Permutations {
    public static void printPermutation(String ans, String s){
        // base case
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        // jitne characters utne baar call lagayenge
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            printPermutation(ans+ch, left+right);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        printPermutation("",s);
    }
}