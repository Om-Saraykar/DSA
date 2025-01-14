package Graphs;
import java.util.*;

public class CheapestFlightWithKStops {
    // leetcode 787
    // Cheapest Flight With K Stops
    // https://leetcode.com/problems/cheapest-flights-within-k-stops/
    // Approach: Dijkstra's Algorithm
    // Time: O(ElogV) where E is the number of edges and V is the number of vertices
    // Space: O(V+E)
    
    class Solution {
        class Cell implements Comparable<Cell>{
            int node;
            int price;
            int stops;

            Cell (int flight, int price, int stops) {
                this.node = flight;
                this.price = price;
                this.stops = stops;
            }

            @Override
            public int compareTo(Cell o) {
                return Integer.compare(o.price, this.price);
            }
        }
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            // make adj list
            List<List<Cell>> adj = new ArrayList<>();
            for(int i=0; i<n; i++) adj.add(new ArrayList<>());

            // populate adj list
            for(int[] flight: flights) {
                adj.get(flight[0]).add(new Cell(flight[1], flight[2], 0));
            }

            
            int[] ans = new int[n];
            Arrays.fill(ans, Integer.MAX_VALUE);
            ans[src] = 0;

            PriorityQueue<Cell> pq = new PriorityQueue<>();
            pq.add(new Cell(src,0,0));

            while(!pq.isEmpty()) {
                Cell front = pq.poll();
                int node = front.node, price = front.price, stops = front.stops;
                System.out.println(node + " " + price + " " + stops);

                if(stops > k) continue;
                if(node == dst) break;

                for(Cell c: adj.get(node)) {
                    int totalPrice = c.price + price;
                    if(totalPrice < ans[c.node]) {
                        ans[c.node] = totalPrice;
                        pq.add(new Cell(c.node, totalPrice, stops + 1));
                    }
                }

            }

            // print answer array
            System.out.println();
            for(int ele: ans) {
                System.out.print(ele + " ");
            }
            System.out.println();

            return ans[dst];
        }
    }
}
