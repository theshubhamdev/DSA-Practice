package Stacks;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean containsDuplicate(String s) {
        String openingChars = "({[";
        String operators = "+-*/";
        String operands = "abcd";
        String closingChars = ")}]";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (openingChars.indexOf(ch) > -1
                    || operators.indexOf(ch) > -1
                    || operands.indexOf(ch) > -1) {
                st.push(ch);
            } else {
                int count = 0;
                while (openingChars.indexOf(st.peek()) != closingChars.indexOf(ch)) {
                    st.pop();
                    count++;
                }
                if (count == 0) {
                    return true;
                } else {
                    st.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "((a+(b))+(c+d))";
        System.out.println(containsDuplicate(s));
    }
}