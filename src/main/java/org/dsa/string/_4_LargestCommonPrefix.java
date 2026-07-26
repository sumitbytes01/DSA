package org.dsa.string;

import java.util.Arrays;

public class _4_LargestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(verticalScanning(new String[]{"flower", "flow", "flight"}));
        System.out.println(sortWay(new String[]{"flower", "flight", "flow"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    private static String verticalScanning(String[] strings) {
        StringBuilder res = new StringBuilder();
        String word1 = strings[0];
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            for (int word = 1; word < strings.length; word++) {
                if (i >= strings[word].length() || ch != strings[word].charAt(i)) {
                    return res.toString();
                }
            }
            res.append(ch);
        }
        return res.toString();
    }

    private static String sortWay(String[] strings) {
        Arrays.sort(strings);
        StringBuilder res = new StringBuilder();
        String firstWord = strings[0];
        String lastWord = strings[strings.length - 1];
        for (int i = 0; i < Math.min(firstWord.length(), lastWord.length()); i++) {
            if (firstWord.charAt(i) != lastWord.charAt(i)) {
                return res.toString();
            }
            res.append(firstWord.charAt(i));
        }
        return res.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
        int s = strs.length;
        String ans = strs[0];
        for (int i = 1; i < s; i++) {
            while (!strs[i].startsWith(ans)) {
                ans = ans.substring(0, ans.length() - 1);
            }
            if (ans.isEmpty())
                return "";
        }
        return ans;
    }
}