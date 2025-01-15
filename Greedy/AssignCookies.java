package Greedy;

import java.util.Arrays;

public class AssignCookies {
    // Leetcode 455: Assign Cookies

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i=0, j=0; int count = 0;
        while(i<s.length && j<g.length) {
            int cookieSize = s[i];
            int greed = g[j];
            if(greed > cookieSize) {
                i++;
                continue;
            }
            count++; i++; j++;
        }

        return count;
    }
}
