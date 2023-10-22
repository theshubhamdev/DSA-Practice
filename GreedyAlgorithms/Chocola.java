package GreedyAlgorithms;

import java.util.*;
public class Chocola {
    public static void main(String[] args) {
        int n = 4;int m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n - 1

        int h = 0; // Which cut are we going to make in Horizontal
        int v = 0; // Which cut are we going to make in Vertical
        int hp = 1; // Horizontal Pieces
        int vp = 1; // Vertical Pieces

        int cost = 0;
        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        while (h < costHor.length && v < costVer.length) {
            // Vertical Cost < Horizontal Cost
            if (costVer[v] <= costHor[h]) { // Horizontal Cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { // Vertical Cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costHor.length) { // Remaining Horizontal Cut
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) { // Remaining Vertical Cut
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Min Cost of Cuts = " + cost);
    }
}
