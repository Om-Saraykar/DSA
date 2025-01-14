package Noice;

import java.util.Scanner;

public class HexToDec {
    static int convert(String str){
        int decimal=0, i=str.length()-1;
        char[] arr = str.toCharArray();
        for(char ch : arr){
            int digit;
            if(ch=='A') digit = 10;
            else if(ch=='B') digit = 11;
            else if(ch=='C') digit = 12;
            else if(ch=='D') digit = 13;
            else if(ch=='E') digit = 14;
            else if(ch=='F') digit = 15;
            else digit = ch-48;
            decimal += (int) (digit*Math.pow(16,i));
            i--;
        }

        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(convert(str));
    }
}