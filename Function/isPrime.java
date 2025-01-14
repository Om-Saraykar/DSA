package Function;
import java.util.Scanner;

public class isPrime {
    public static boolean optimizedPrime(int n){
        // this is optimized
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean notOptimized(int n){
        // this is not optimized
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a +ve number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(notOptimized(n));
        System.out.println(optimizedPrime(n));
    }
}
