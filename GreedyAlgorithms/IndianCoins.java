package GreedyAlgorithms;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer denominations[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(denominations, Collections.reverseOrder());
        int amount = 590;
        ArrayList<Integer> list = new ArrayList<>();
        int countDenominations = 0;
        for (int i = 0; i < denominations.length; i++) {
            if (amount == 0) {
                break;
            }
            if (amount > denominations[i]) {
                while (denominations[i] <= amount) {
                    list.add(denominations[i]);
                    amount -= denominations[i];
                    countDenominations += 1;
                }
            }
        }
        System.out.println("Denominations = "+ list);
        System.out.println("Count = "+ countDenominations);
    }
}
