package Recursion;
import java.util.Scanner;

public class GenerateParentheses {
    public static void printParentheses(int open, int close,String ans, int n){
        // base case
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        // recursive call
        if(open<n || ans.isEmpty())
            printParentheses(open+1, close,ans+'(', n);
        if(close<open)
            printParentheses(open,close+1,ans+')', n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printParentheses(0,0,"",n);
    }
}
