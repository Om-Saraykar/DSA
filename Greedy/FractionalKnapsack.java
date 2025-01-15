package Greedy;
import java.util.*;

public class FractionalKnapsack {
    // Find Maximum Fractional Knapsack

     // ItemValue class
     static class ItemValue implements Comparable<ItemValue>{
        int weight;
        int profit;

        ItemValue(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
        }

         @Override
         public int compareTo(ItemValue o) {
             return Integer.compare(this.profit/this.weight, o.profit/o.weight);
         }
     }

    // Function to get maximum value
    private static double getMaxValue(ItemValue[] arr, int capacity) {
        // Sorting items by profit/weight ratio
        Arrays.sort(arr, (item1, item2) -> {
            double cpr1 = (double)item1.profit / (double)item1.weight;
            double cpr2 = (double)item2.profit / (double)item2.weight;

            if (cpr1 < cpr2)
                return 1;
            else
                return -1;
        });

        double totalValue = 0d;

        for (ItemValue i : arr) {

            int curWt = i.weight;
            int curVal = i.profit;

            if (capacity - curWt >= 0) {

                // This weight can be picked whole
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else {

                // Item cant be picked whole
                double fraction = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity = (int)(capacity - (curWt * fraction));
                break;
            }
        }

        return totalValue;
    }


    public static void main(String[] args) {

        ItemValue[] arr = {
                new ItemValue(60, 10),
                new ItemValue(100, 20),
                new ItemValue(120, 30)
        };

        int capacity = 50;

        double maxValue = getMaxValue(arr, capacity);

        // Function call
        System.out.println(maxValue);
    }

}
