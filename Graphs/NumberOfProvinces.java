package Graphs;

public class NumberOfProvinces {
    // Leetcode 547
    // Number of Provinces

    // Method 1: BFS
    // Method 2: DFS
    // Method 3: DSU

    class Solution {
        int[] parent;
        int[] size;

        private void unionOf(int a, int b) {
            a = find(a);
            b = find(b);

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

        private int find(int n) {
            if(parent[n] == n) return n;
            return find(parent[n]);
        }

        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;
            parent = new int[n+1]; // 1 to n nodes
            size = new int[n+1];

            for(int i=1; i<=n; i++) {
                parent[i] = i; // every node is its own parent
                size[i] = 1;
            }

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    // edge is from i+1 and j+1
                    if(i!=j && isConnected[i][j] == 1) {
                        unionOf(i+1, j+1);
                    }
                }
            }

            // count number of provinces
            int count = 0;
            for(int i=0; i<n; i++) {
                if(parent[i] == i) count++;
            }
            return count;
        }
    }

}
