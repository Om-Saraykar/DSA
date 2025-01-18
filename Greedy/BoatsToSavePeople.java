package Greedy;
import java.util.Arrays;

public class BoatsToSavePeople {
    // Leetcode 881: Boats to Save People

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length-1;

        int ans = 0;
        while(left <= right) {
            if(people[right] + people[left] <= limit) {
                left++; right--;
            }
            else {
                right--;
            }
            ans++;
        }

        return ans;
    }
}
