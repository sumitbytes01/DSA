package org.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static void main(String[] args) {
        Map<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String roman = "III";
        int num = 0;
        for(int i = 0; i< roman.length()-1;i++){

            if(map.get(roman.charAt(i)) < map.get(roman.charAt(i+1))){
                num = num - map.get(roman.charAt(i));
            }
            else {
                num = num+ map.get(roman.charAt(i));
            }
        }
        System.out.println(num+ map.get(roman.charAt(roman.length() - 1)));
    }
}
