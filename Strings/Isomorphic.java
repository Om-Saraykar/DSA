package Strings;
import java.util.Arrays;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t){
        char[] arr = new char[128];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            if(arr[(int)ch]=='\0'){
                arr[(int)ch] = dh;
            } else{
                if(arr[(int)ch]!=dh) return false;
            }
        }
        Arrays.fill(arr, '\0');

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            if(arr[(int)ch]=='\0'){
                arr[(int)ch] = dh;
            } else{
                if(arr[(int)ch]!=dh) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "\u0000\u0000";
        String t = "\u0000c";
        System.out.println(isIsomorphic(s, t));
    }
}