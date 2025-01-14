package Function;

import java.util.*;

public class factorial {
    public static int fact(int n){
        int sum = 1;
        for(int i=n; i>0; i--){
            sum *= i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("The factorial of " + n + " is " + ans);
        sc.close();
    }
}
