package Graphs;
import java.util.*;


public class RedundantConnection {
    // Leetcode 648
    // Redundant Connection

    static class Solution {
        int[] parent;
        int[] size;

        class Edge implements Comparable<Edge> {
            int u;
            int v;
            int dist;

            Edge(int u, int v, int dist) {
                this.u = u;
                this.v = v;
                this.dist = dist;
            }


            @Override
            public int compareTo(Edge o) {
                return Integer.compare(this.dist, o.dist);
            }
        }

        private int leader(int a) {
            if(parent[a] == a) return a;
            return parent[a] = leader(parent[a]);
        }

        private void union(int u, int v) {
            int a = leader(u);
            int b = leader(v);

            if(a != b) {
                if(size[a] > size[b]) {
                    parent[b] = a;
                    size[a] += size[b];
                }
                else {
                    parent[a] = b;
                    size[b] += size[a];
                }
            }
        }

        public int minCostConnectPoints(int[][] points) {
            int n = points.length;
            parent = new int[n];
            size = new int[n];

            for(int i=0; i<n; i++) {
                parent[i] = i;
                size[i] = 1;
            }

            List<Edge> list = new ArrayList<>();
            for(int u=0; u<n; u++) {
                for(int v=u+1; v<n; v++) {
                    int x1 = points[u][0], y1 = points[u][1];
                    int x2 = points[v][0], y2 = points[v][1];

                    int dist = Math.abs(x2-x1) + Math.abs(y2-y1);
                    list.add(new Edge(u,v,dist));
                }
            }

            Collections.sort(list);

            int cost = 0;
            for(int i=0; i<list.size(); i++) {
                Edge top = list.get(i);
                int u = top.u, v = top.v, dist = top.dist;

                if(leader(u) != leader(v)) {
                    cost += dist;
                    union(u, v);
                }
            }
            return cost;
        }
    }
}
