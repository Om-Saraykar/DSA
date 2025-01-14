package Array2d;

import java.util.Scanner;

public class Multiplication{
    static void multiply(int m, int n, int q, int[][] mat1, int[][] mat2){
        int[][] mat = new int[m][q];

        for (int i=0; i<m; i++){
            for (int j=0; j<q; j++) {
                for (int k=0; k<n; k++){
                    mat[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        
        // output
        for (int i=0; i<m; i++) {
            for (int j=0; j<q; j++){
                System.out.printf(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st Matrix no. of rows = ");
        int m = sc.nextInt();
        System.out.print("1st Matrix no. of cols = ");
        int n = sc.nextInt();

        System.out.print("2nd Matrix no. of rows = ");
        int p = sc.nextInt();
        System.out.print("2nd Matrix no. of cols = ");
        int q = sc.nextInt();

        if(n==p){
            int[][] mat1 = new int[m][n];
            int[][] mat2 = new int[p][q];
            System.out.println("Enter 1st Matrix : ");
            for(int i=0; i<m; i++){
                for (int j=0; j<n; j++){
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter 2nd Matrix : ");
            for(int i=0; i<p; i++){
                for (int j=0; j<q; j++){
                    mat2[i][j] = sc.nextInt();
                }
            }
            multiply(m, n, q, mat1, mat2);
        }
        else{
            System.out.println("Matrices can't be multiplied.");
        }
    }
}
