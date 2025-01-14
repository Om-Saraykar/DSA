package Graphs;

import java.util.PriorityQueue;

public class MinCostToConnectAllPoints {
    // Leetcode 1584
    // Min Cost to Connect all Points


    class Solution {
        class Triplet implements Comparable<Triplet>{
            int node;
            int parent;
            int dist;

            Triplet(int node, int parent, int dist) {
                this.node = node;
                this.parent = parent;
                this.dist = dist;
            }

            @Override
            public int compareTo(Triplet t) {
                if(t.dist == this.dist) return Integer.compare(this.node, t.node);
                return Integer.compare(this.dist, t.dist);
            }
        }

        public int minCostConnectPoints(int[][] points) {
            int n = points.length;
            PriorityQueue<Triplet> pq = new PriorityQueue<>();
            pq.add(new Triplet(0,-1,0));

            int sum = 0;
            boolean[] visited = new boolean[n];

            while(!pq.isEmpty()) {
                Triplet top = pq.poll();
                int node = top.node, parent = top.parent, dist = top.dist;
                if(visited[node]) continue;

                visited[node] = true;
                sum += dist;

                for(int i=0; i<n; i++) {
                    if(i==node || i==parent) continue;
                    if(visited[i]) continue;
                    int x1 = points[node][0], y1 = points[node][1];
                    int x2 = points[i][0], y2 = points[i][1];
                    int mDis = Math.abs(x2-x1) + Math.abs(y2-y1);

                    pq.add(new Triplet(i, node, mDis));
                }
            }
            return sum;
        }
    }
}
