package Function;

import java.util.*;

public class decimalToBinary {
    public static void deci2binary(int n){
        int bit = 0, place = 1;
        while(n>0){
            bit += (n%2)*place;
            place *= 10;
            n /=2;
        }
        System.out.println(bit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int n = sc.nextInt();
        sc.close();
        deci2binary(n);
    }
}
