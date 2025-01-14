package Recursion;
import java.util.Scanner;

public class BinaryStrings {
    public static void printString(String s, int n){
        // base case
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        // recursive call
        if(s.isEmpty() || s.charAt(s.length()-1)=='0'){
            printString(s+0, n);
            printString(s+1, n);
        }
        else{
            printString(s+0, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printString("", n);
    }
}
