package Stacks;

import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        String openingChars = "({[";
        String closingChars = ")}]";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (openingChars.indexOf(ch) > -1) {
                st.push(ch);
            } else {
                if (!st.isEmpty() && openingChars.indexOf(st.peek()) == closingChars.indexOf(ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "({})[]]";
        System.out.println(isValid(s));
    }
}
