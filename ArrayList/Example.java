package ArrayList;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add elements in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // print
        System.out.println(list);

        // get
        // System.out.println(list.get(0));

        // delete
        // list.remove(0);
        // System.out.println(list);

        // Set
        list.set(0, 10);
        System.out.println(list);

        // Contains
        System.out.println(list.contains(4));
    }
}
