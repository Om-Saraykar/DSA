package Leetcode;
import java.util.*;

public class Solution1 {
    public int numberOfSubstrings(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            boolean validFound = false;
            for (int value : map.values()) {
                if (value >= k) {
                    validFound = true;
                    break;
                }
            }

            while (validFound) {
                count += s.length() - right;
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;

                validFound = false;
                for (int value : map.values()) {
                    if (value >= k) {
                        validFound = true;
                        break;
                    }
                }
            }
        }

        return count;
    }

}
