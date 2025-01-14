package Array2d;

import java.util.Scanner;

public class SpiralArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int n = sc.nextInt();

        System.out.println("Enter Matrix :");
        int[][] arr = new int[m][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int rMax = arr.length - 1, rMin = 0, cMax = arr[0].length - 1, cMin = 0;

        while((rMax>=rMin) && (cMax>=cMin)){
            // ---->
            for(int i=cMin; i<=cMax; i++){
                System.out.print(arr[rMin][i]+" ");
            }
            rMin++;

            // down
            if(cMin>cMax || rMin>rMax) break;
            for(int i=rMin; i<=rMax; i++){
                System.out.print(arr[i][cMax]+" ");
            }
            cMax--;

            // <----
            if(cMin>cMax || rMin>rMax) break;
            for(int i=cMax; i>=cMin; i--){
                System.out.print(arr[rMax][i]+" ");
            }
            rMax--;
            // up
            if(cMin>cMax || rMin>rMax) break;
            for(int i=rMax; i>=rMin; i--){
                System.out.print(arr[i][cMin]+" ");
            }
            cMin++;
        }
    }
}