package StringBuilders;

public class StringCompression {
    public static StringBuilder compressString(String s){
        int i=0;
        StringBuilder ans = new StringBuilder();

        while(i<s.length()){
            int count = 1;
            for(int j=i+1; j<s.length() && s.charAt(j)==s.charAt(i); j++){
                count++;
            }
            ans.append(s.charAt(i));
            if(count != 1) ans.append(count);
            i += count;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "aaaabbcddeff";
        System.out.println(compressString(s));
    }
}
