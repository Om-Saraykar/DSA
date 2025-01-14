package Function;
import java.util.*;

public class nCr {
    public static int fact(int n){
        int res = 1;
        for(int i=n; i>0; i--){
            res *= i;
        }
        return res;
    }
    public static int bino(int n, int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        System.out.print("Enter r : ");
        int r = scan.nextInt();
        System.out.println(n + "C" + r + " = " + bino(n,r));
        scan.close();
    }
}
