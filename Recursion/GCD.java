package Recursion;
import java.util.Scanner;

public class GCD {
    public static int iteGcd(int a, int b ){
        int n = Math.min(a, b);
        for(int i=n; i>0; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }
    public static void recGcd(int a, int b){
        // base case
        if(b%a==0){
            System.out.println(a);
            return;
        }
        // recursive call
        recGcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println(iteGcd(a,b));
        recGcd(b,a);

    }
}
