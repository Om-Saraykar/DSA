package Recursion;
import java.util.Scanner;

public class StairPath {
    public static int stairs(int n){
        // base case
        if(n<=2)
            return n;
        // recursive call
        return stairs(n-1)+ stairs(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = stairs(n);
        System.out.println(ans);
    }
}