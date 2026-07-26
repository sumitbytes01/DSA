package org.dsa.string;

import java.util.Stack;

public class _1_RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOutermostParenthesis(s));
    }

    private static String removeOutermostParenthesis(String s) {
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (depth > 0)
                    sb.append(s.charAt(i));
                depth++;
            } else {
                depth--;
                if (depth > 0)
                    sb.append(s.charAt(i));

            }
        }
        return sb.toString();
    }
}