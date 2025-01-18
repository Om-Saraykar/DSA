package Greedy;
import java.util.*;

public class MergeIntervals {
    // Leetcode 56: Merge Intervals

    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

            List<int[]> ans = new ArrayList<>();

            for (int[] interval : intervals) {
                if (ans.isEmpty() || ans.getLast()[1] < interval[0]) {
                    ans.add(interval);
                } else {
                    int[] newInterval = new int[2];
                    newInterval[0] = ans.getLast()[0];
                    newInterval[1] = Math.max(ans.getLast()[1], interval[1]);
                    ans.set(ans.size() - 1, newInterval);
                }
            }

            return ans.toArray(new int[ans.size()][]);
        }
    }
}
