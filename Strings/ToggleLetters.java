package Strings;
import java.util.Scanner;

public class ToggleLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i=0; i<sb.length(); i++){
            // A -> 65     Z -> 90        a -> 97      z -> 122
            char ch = sb.charAt(i);
            int ascii = ch;
            if(ascii>=65 && ascii<=90){
                sb.setCharAt(i, (char) (ascii+32));
            }
            else if(ascii>=97 && ascii<=122){
                sb.setCharAt(i, (char) (ascii-32));
            }
        }
        System.out.println(sb);

    }
}