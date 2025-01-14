package Noice;
import java.util.Scanner;

public class LcmAndGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int i = Math.min(num1,num2);
        int gcd=1;
        while(i>0){
            if(num1%i==0 && num2%i==0){
                gcd = i;
                break;
            }
            i--;
        }

        System.out.println("GCD is " + gcd);
        int lcm = Math.abs(num1*num2)/gcd;
        System.out.println("LCM is " + lcm);
    }
}