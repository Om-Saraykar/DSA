package PatternPrinting;
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int rows = sc.nextInt();
        int ans = 0;

        for (int i=1; i<=rows; i++) {
            int count1 = ((rows-(i-1))*2)-1;
            int count2 = (rows-1)*2-1;
            for (int j=1; j<=i; j++) {
                if(j==1) {
                    // first column
                    ans = i;
                    System.out.print(i + "  ");
                }
                else if(j%2==1){
                    // odd column
                    ans += (count2-count1);
                    System.out.print(ans + "  ");
                    count2 -= 4;
                }
                else{
                    // even column
                    ans += count1;
                    System.out.print(ans + "  ");
                }
            }
            System.out.println();
        }
    }
}