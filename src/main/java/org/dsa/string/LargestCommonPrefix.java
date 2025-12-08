package org.dsa.string;

import java.util.Arrays;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(verticalScanning());
        System.out.println(sortWay());
    }

    private static String verticalScanning() {
        String[] strs = {"flower", "flow", "flight"};
        if(strs == null || strs.length ==0)
            return "";
        // this would be used to compare across all string and their individual characters
        String first = strs[0];
        // iterating every character of first string
        for(int i = 0; i< first.length();i++){
            char c = first.charAt(i);
            // iterating all characters other than first one
            for(int j = 1; j<strs.length;j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    private static String sortWay() {
        String[] strs = {"flower", "flow", "flight"};
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i))
                return sb.toString();
            sb.append(first.charAt(i));
        }
    return sb.toString();}
}
