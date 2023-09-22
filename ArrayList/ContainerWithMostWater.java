package ArrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int FindContainer(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int width = j - i;
                int height = Math.min(list.get(i), list.get(j));
                int area = width * height;
                max = Math.max(max, area);
            }
        }
        return max;
    }

    public static int StoreWater(ArrayList<Integer> list) {
        int max = 0;
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int width = rp - lp;
            int height = Math.min(list.get(rp), list.get(lp));
            int area = width * height;
            max = Math.max(max, area);
            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(StoreWater(list));
    }
}
