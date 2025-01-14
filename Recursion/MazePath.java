package Recursion;
import java.util.Scanner;

public class MazePath {
    public static int proMaze(int m, int n){
        // base case
        if(m==1 || n==1){
            return 1;
        }
        // recursive case
        int rightWays = proMaze(m, n-1);
        int leftWays = proMaze(m-1, n);
        return rightWays+leftWays;
    }
    public static int maze(int row, int col, int m, int n){
        // base case
        if(row==m || col==n){
            return 1;
        }
        // recursive case
        int rightWays = maze(row, col+1, m, n);
        int leftWays = maze(row+1, col, m, n);
        return rightWays + leftWays;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        // int ans = maze(1,1,m,n);
        int ans = proMaze(m,n);
        System.out.println("There are " + ans + " ways.");
    }
}