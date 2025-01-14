package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        // input number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int nsp = n;

        // declare ArrayList
        ArrayList<ArrayList<Integer>> grid = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            grid.add(new ArrayList<>(i+1));
        }

        // add Pascal Triangle
        for (int i=0; i<n; i++) {

            for (int j=0; j<=i; j++) {
                if(i==j || j==0) grid.get(i).add(1);
                else{
                    int value = (grid.get(i-1).get(j)) + (grid.get(i-1).get(j-1));
                    grid.get(i).add(value);
                }

            }
        }

        // output
        for (ArrayList<Integer> row : grid) {

            // spaces
            for(int i=nsp; i>0; i--){
                System.out.print(" ");
            }
            nsp--;

            // element
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
