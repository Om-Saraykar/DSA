package Strings;
import java.util.Arrays;
import java.util.Scanner;

public class MostOccurringLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        Arrays.sort(arr);
        int i=0,j=1, countMax = Integer.MIN_VALUE;
        int count = 1;
        while(j<arr.length){

            if(arr[i]==arr[j]){
                count++;
                if(count>countMax) countMax = count;
            }
            else{
                i = j;
                count = 1;
            }
            j++;
        }
        System.out.println(countMax);
        // best method -> create a array of size 26
    }
}
