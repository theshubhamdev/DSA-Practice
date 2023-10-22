package GreedyAlgorithms;

import java.util.*;
public class FractionalKnapsack {
    public static int fractionalKnapsack(int val[], int wt[], int W) {
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= wt[idx]) { // include full item
                finalVal += val[idx];
                capacity -= wt[idx];
            } else {
                // include fractional Item
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        return finalVal;
    }
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;
        System.out.println(fractionalKnapsack(val, wt, W));
    }
}
