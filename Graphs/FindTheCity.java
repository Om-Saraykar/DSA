package Graphs;

public class FindTheCity {
    // Leetcode 1334
    // Find the City With the Smallest Number of Neighbors at a Threshold Distance

    class Solution {
        public int findTheCity(int n, int[][] edges, int threshold) {

            // make distance array
            int[][] dist = new int[n][n];
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }

            // populate dist array
            for(int[] arr: edges) {
                int u = arr[0], v = arr[1], wt = arr[2];
                dist[u][v] = wt;
                dist[v][u] = wt;
            }

            // floyd warshal algorithm
            for(int k=0; k<n; k++) {
                for(int i=0; i<n; i++) {
                    if(i==k) continue;
                    for(int j=0; j<n; j++) {
                        if(j==k) continue;
                        if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE) {
                            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[j][k]);
                        }
                    }
                }
            }

            // find minCity
            int minCity = -1;
            int minCount = Integer.MAX_VALUE;
            for(int i=0; i<n; i++) {
                int count = 0;
                for(int j=0; j<n; j++) {
                    if(i==j) continue;
                    if(dist[i][j]  <= threshold) count++;
                }
                if(count<=minCount) {
                    minCount = count;
                    minCity = i;
                }
            }
            return minCity;
        }
    }
}
