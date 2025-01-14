package Strings;
import java.util.Scanner;

public class ReverseSentence {
    public static void reverseWord(StringBuilder sb, int i, int j){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i=0, j=1;
        while(j<sb.length()){
            if(sb.charAt(j)==' ' || j==sb.length()){
                reverseWord(sb, i, j-1);
                i = j+1;

                // for multiple spaces
                while(sb.charAt(i) == ' ') i++;

                j = i+1;
            }
            else j++;
        }
        // reverse again for last word
        reverseWord(sb, i, j-1);
        System.out.println(sb);
    }
}