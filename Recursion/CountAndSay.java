package Recursion;

public class CountAndSay {
    public static String countAndSay(int n){
        // base case
        if(n==1) return "1";

        // modify the string
        String s = countAndSay(n-1) + "@";
        String ans = "";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                // add length
                ans += j-i;
                // add char
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }
}