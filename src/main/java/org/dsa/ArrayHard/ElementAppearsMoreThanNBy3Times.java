package org.dsa.ArrayHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementAppearsMoreThanNBy3Times {
    public static void main(String[] args) {
        int array[] = {11, 33, 33, 11, 33, 11};
        // O(n^2)
        List<Integer> list = new ArrayList<>();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (list.size() == 0 || list.get(0) != array[i]) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (array[i] == array[j])
                        count++;
                }
                if (count > n / 3) {
                    list.add(array[i]);
                }
                if (list.size()==2)
                    break;
            }
        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println();
    // hashmap
        // // O(nlogn)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: array){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>n/3)
                System.out.println(e.getKey());
        }
        System.out.println();
    // MooreAlgo extension
        int count1 = 0;
        int ele1 = -1;
        int count2 = 0;
        int ele2 = -1;
        for (int i = 0; i < n; i++) {
            if(count1 == 0 && array[i] != ele2){
                ele1 = array[i];
                count1++;
            } else if (count2 == 0 && array[i] != ele1) {
                ele2 = array[i];
                count2++;
            } else if (ele1==array[i]) {
                count1++;
            } else if (ele2==array[i]) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        if(count1>n/3)
            System.out.println(ele1);
        if(count2>n/3)
            System.out.println(ele2);
    }
}
