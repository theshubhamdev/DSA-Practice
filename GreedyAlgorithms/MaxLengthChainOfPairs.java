package GreedyAlgorithms;

import java.util.*;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        //Adding First One
        int lastPair = pairs[0][1];
        list.add(pairs[0][1]);
        max = 1;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastPair) {
                list.add(pairs[i][1]);
                lastPair = pairs[i][1];
                max++;
            }
        }
        System.out.println("Max Length Chain Of Pairs = " + max); // 3
        System.out.println(list); // [24, 40, 90]
    }
}
