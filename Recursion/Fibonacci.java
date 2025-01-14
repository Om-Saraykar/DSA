package Recursion;
import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }
        // recursive call
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }
}