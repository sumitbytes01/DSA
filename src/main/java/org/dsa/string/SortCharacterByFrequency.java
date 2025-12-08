package org.dsa.string;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String str = "raaaajj";
        System.out.println(approach1(str));
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
