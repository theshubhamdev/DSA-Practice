package ArrayList;

import java.util.ArrayList;

public class Add2Numbers {
    public static boolean Check(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    
    public static boolean CheckSortedAndRotated(ArrayList<Integer> list, int target) {
        int pivotPoint = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivotPoint = i;
                break;
            }
        }
        int lp = pivotPoint + 1;
        int rp = pivotPoint;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(CheckSortedAndRotated(list, 5));
    }
}
