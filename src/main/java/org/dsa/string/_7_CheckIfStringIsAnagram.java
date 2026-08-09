package org.dsa.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _7_CheckIfStringIsAnagram {
    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "bb";
        System.out.println(approach1(str1, str2));
        System.out.println(approach2(str1, str2));
        System.out.println(approach3(str1, str2));
    }

    private static boolean approach3(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        int[] arr = new int[26];
        for(char ch : str1.toCharArray()){
            arr[ch - 'a']++;
        }
        for(char ch : str2.toCharArray()){
            arr[ch - 'a']--;
        }
        for(int n: arr){
            if(n != 0)
                return false;
        }
        return true;
    }

    private static boolean approach2(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (char ch: str2.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)-1);
        }
        for(int n: map.values()){
            if(n!=0)
                return false;
        }
        return true;
    }

    private static boolean approach1(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        var strArr1 = str1.toCharArray();
        var strArr2 = str2.toCharArray();
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        for(int i = 0; i<str1.length(); i++){
            if(strArr1[i] != strArr2[i])
                return false;
        }
    return true;
    }
}
