package HashMaps;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

    }
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: digits){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele,1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=100; i<=999; i++){
            int x = i;
            int a = x%10; x/=10;
            int b = x%10; x/=10;
            int c = x;

            if(map.containsKey(a)){
                int aFreq = map.get(a);
                map.put(a, aFreq-1);
                if (aFreq==1) map.remove(a);
                if(map.containsKey(b)){
                    int bFreq = map.get(b);
                    map.put(b, bFreq-1);
                    if (bFreq==1) map.remove(b);
                    if(map.containsKey(c)){
                        ans.add(i);
                    }
                    map.put(b, bFreq);
                }
                map.put(a, aFreq);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
