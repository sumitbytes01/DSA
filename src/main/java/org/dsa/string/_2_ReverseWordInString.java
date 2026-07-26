package org.dsa.string;

public class _2_ReverseWordInString {
    public static void main(String[] args) {
        String str = "Hello World from DSA";
        String str1 = "a good   example";
        System.out.println(reverseWordsInString(str));
    }

    private static String reverseWordsInString(String str) {
        StringBuilder res = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                if (res.length() > 0)
                    res.append(' ');
                res.append(word.reverse());
                word.setLength(0);
            }
        }
        if (word.length() > 0) {
            if (res.length() > 0)
                res.append(' ');
            res.append(word.reverse());
        }
    return res.toString();
}
}
