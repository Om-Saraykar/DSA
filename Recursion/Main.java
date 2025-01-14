package Recursion;
import java.util.Scanner;

public class Main {
    static void print(int n){
        // base case
        if(n==0) return;
        // recursive call
        print(n-1);
        System.out.println(n);
    }
    static int sum(int n){
        // base case
        if (n==0) return 0;
        // recursive call
        return n + sum(n-1);
    }
    static int power(int a, int b){
        // base case
        if(b==0) return 1;
        // recursive call
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // print(n);
        // System.out.println(sum(n));

        System.out.println(power(n,m));
    }
}