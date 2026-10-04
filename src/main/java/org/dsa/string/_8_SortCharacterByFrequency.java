package org.dsa.string;

import java.util.*;

public class _8_SortCharacterByFrequency {
    public static void main(String[] args) {
        String str = "raaaakkjj";
        System.out.println(approach1(str));
       // System.out.println(approach2(str));
    }

    private static void approach2(String str) {
        Map<Character, Integer> chatToCount  = new HashMap<>();
        for(char ch: str.toCharArray()){
            chatToCount.put(ch, chatToCount.getOrDefault(ch,0)+1);
        }
        // unique characters
        List<Character> list = new ArrayList<>(chatToCount.keySet());
        list.sort((a,b)->{
            if(!chatToCount.get(a).equals(chatToCount.get(b))){
                return chatToCount.get(b) - chatToCount.get(a); // frequency descending
            }
                return a-b; // alpha ascending
        });

    }

    private static String approach1(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((ob1, ob2) -> map.get(ob2) - map.get(ob1));
        for(char ch: list){
           for(int i = 0; i<map.get(ch);i++){
               sb.append(ch);
           }
        }
    return sb.toString();
    }
}
