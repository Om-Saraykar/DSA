package Graphs;

public class IsGraphBipartite {
    // Leetcode 785
    // Is Graph Bipartite

    static class Solution {
        int[] parent;
        int[] size;
        boolean[] parity;

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
                    parity[v] = !parity[u];
                }
                else {
                    parent[a] = b;
                    size[b] += size[a];
                    parity[u] = !parity[v];
                }
            }
        }

        public boolean isBipartite(int[][] graph) {
            int n = graph.length;
            int m = graph[0].length;

            parent = new int[n];
            size = new int[n];
            parity = new boolean[n];
            for(int i=0; i<n; i++) { // populate arr
                parent[i] = i;
                size[i] = 1;
            }

            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    int u = i, v = graph[i][j];

                    if(v>u) {
                        if(leader(u) == leader(v)) { // cycle detected
                            if(parity[u] == parity[v]) return false;
                        }
                        else {
                            union(u, v);
                        }
                    }
                }
            }

            return true;
        }
    }
}
