package Recursion;

public class SkipCharacter {
    static StringBuilder ans = new StringBuilder();
    public static void skip(String s, int n){
        // base case
        if(n<0){
            return;
        }
        // recursive call
        skip(s, n-1);
        if(s.charAt(n)!='a'){
            ans.append(s.charAt(n));
        }
    }
    public static void main(String[] args) {
        String s = "avengers assemble";
        skip(s, s.length()-1);
        System.out.println(ans);
    }
}