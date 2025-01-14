package Linked_List;


// does not work properly
public class HappyNumber {
    public static int squaresSum(String str){
        if(str.charAt(0)=='1') return 1;
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            int a = Integer.parseInt(str, i);
            sum += a*a;
        }
        str = Integer.toString(sum);
        return squaresSum(str);
    }
    public static boolean isHappy(int n){
        String num = Integer.toString(n);
        int finalAnswer = squaresSum(num);
        System.out.println(finalAnswer);
        if(finalAnswer==1) return true;
        else return false;

    }
    public static void main(String[] args) {
        boolean ans = isHappy(44);
        System.out.println(ans);
    }
}
