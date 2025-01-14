package Recursion;

public class PrintString {
    public static void print(String s, int n){
        if(n<0) return;
        print(s,n-1);
        System.out.print(s.charAt(n));
    }
    public static void main(String[] args) {
        String s = "Avengers Assemble";
        print(s, s.length()-1);
    }
}
