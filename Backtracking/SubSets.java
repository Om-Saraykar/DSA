package Backtracking;

public class SubSets {
    public static void findSubsets(String str, int i, String ans){
        // base case
        if(i==str.length()){
            if(ans.isEmpty()){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // Yes
        findSubsets(str, i+1, ans+str.charAt(i));
        // No
        findSubsets(str, i+1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}