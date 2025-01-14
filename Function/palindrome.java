package Function;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int lastdigit = 0, revnum = 0, orinum = n;

        while (n>0) {
            revnum *= 10;
            lastdigit = n%10;
            revnum += lastdigit;
            n /= 10;
        }
        // System.out.println(revnum);
        if(orinum == revnum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
