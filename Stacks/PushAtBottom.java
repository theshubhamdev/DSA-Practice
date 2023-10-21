package Stacks;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int val = s.pop();
        pushAtBottom(s, data);
        s.push(val);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reverseString2(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int val = s.pop();
        reverseStack(s);
        pushAtBottom(s, val);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtBottom(s, 4);
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }
        // System.out.println(reverseString("abc"));
        reverseStack(s);
        printStack(s);
    }
}
