package Recursion;
import java.util.Scanner;

public class PowerOfNumber {
    public static int power(int a, int b){
        // base case
        if(b==1) return a;
        // recursive call
        int pow = power(a,b/2);
        if(b%2==0){
            return pow*pow;
        }
        else{
            return pow*pow*a;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " to the power " + b + " is " + power(a,b));
    }
}
