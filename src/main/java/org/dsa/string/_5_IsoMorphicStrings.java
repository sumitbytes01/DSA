package org.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class _5_IsoMorphicStrings {
    public static void main(String[] args) {
         System.out.println(checkIsometric());
        System.out.println(betterApproach());
    }

    private static boolean betterApproach(){
        String s = "paper";
        String t = "title";
        // Arrays to track last seen positions of characters in s and t
        int[] m1 = new int[256], m2 = new int[256];

        // Get length of the strings
        int n = s.length();

        // Loop through all characters in the strings
        for (int i = 0; i < n; ++i) {
            // Return false if mapping is inconsistent
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;

            // Update last seen index for both characters
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        // Return true if all character mappings are consistent
        return true;
    }

    private static boolean checkIsometric() {
        String s = "foo";
        String t = "bar";
        if(s.length() != t.length())
            return false;
        // TC - O(n^2)
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) { // O(n)
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!map.containsKey(original)){ // O(1) constant time
                if(!map.containsValue(replacement)){ // O(n)
                    map.put(s.charAt(i), t.charAt(i));
                }
                else
                    return false;
            }
            else {
                char mappedCharacter = map.get(original);
                if(mappedCharacter != replacement)
                    return false;
            }
        }
    return true;
    }
}
