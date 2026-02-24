package org.dsa.string;

import java.util.Stack;

public class _1_RemoveOutermostParentheses {
    public static void main(String[] args) {
        _1_RemoveOutermostParentheses rop = new _1_RemoveOutermostParentheses();
        String s = "(()())(())";
        System.out.println(removeOutermostParantheses(s));
        System.out.println(rop.removeOuterParentheses(s));

        System.out.println(rop.removeOuterParenthesesSimple(s));
    }

    private static String removeOutermostParantheses(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder("");
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (!stack.isEmpty()) {
                    sb.append(ch);
                }
                stack.push(ch);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    private String removeOuterParenthesesSimple(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ')')
                counter--;
            if (counter != 0) {
                sb.append(ch);
            }
            if (ch == '(')
                counter++;
        }
        return sb.toString();
    }

    public static String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder answer = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(' && counter++ > 0)
                answer.append(ch);
            else if (ch == ')' && counter-- > 1)
                answer.append(ch);
        }
        return answer.toString();
    }
}
