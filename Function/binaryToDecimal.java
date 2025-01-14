package Function;

import java.util.*;

public class binaryToDecimal {
    public static void binary2decimal(int n){
        int lastdigit, decimal = 0, i = 0;
        while(n>0){
            lastdigit = n%10;
            decimal += (int) (lastdigit*Math.pow(2, i));
            n /= 10;
            i++;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        binary2decimal(n);
    }
}
