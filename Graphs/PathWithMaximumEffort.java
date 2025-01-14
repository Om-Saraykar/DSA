package Graphs;
import java.util.*;

public class PathWithMaximumEffort {
    // Leetcode 1631
    // Path with Maximum Effort

    static class Solution {
        class Cell implements Comparable<Cell> {
            int x;
            int y;
            int effort;

            Cell(int x, int y, int effort) {
                this.x = x;
                this.y = y;
                this.effort = effort;
            }

            public int compareTo(Cell c) {
                return Integer.compare(this.effort, c.effort);
            }
        }
        public int minimumEffortPath(int[][] heights) {
            int m = heights.length, n = heights[0].length;

            // direction array -> up, down, right, left
            int[][] directions = new int[][] {{-1,0},{1,0},{0,1},{0,-1}};

            int[][] effortArr = new int[m][n];
            for(int[] row: effortArr) {
                Arrays.fill(row, Integer.MAX_VALUE);
            }
            effortArr[0][0] = 0;

            PriorityQueue<Cell> pq = new PriorityQueue<>();
            pq.add(new Cell(0, 0, 0));

            while(!pq.isEmpty()) {
                Cell c = pq.poll();
                if(effortArr[c.x][c.y] < c.effort) continue;

                for(int[] dir: directions) {
                    int nx = c.x + dir[0];
                    int ny = c.y + dir[1];

                    if(nx>=0 && nx<=m-1 && ny>=0 && ny<=n-1) {
                        int effort = Math.abs(heights[c.x][c.y] - heights[nx][ny]);
                        int newEffort = Math.max(c.effort, effort);

                        if(newEffort < effortArr[nx][ny]) {
                            effortArr[nx][ny] = newEffort;
                            pq.add(new Cell(nx,ny,newEffort));
                        }
                    }
                }
            }

            return effortArr[m-1][n-1];
        }
    }
}
