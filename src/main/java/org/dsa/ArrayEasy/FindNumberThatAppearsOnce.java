package org.dsa.ArrayEasy;

public class FindNumberThatAppearsOnce {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        int xor = 0;
        for(int num: arr){
            xor = xor^num;
        }
        System.out.println(xor);
    // the other approach is unsing a hashmap
    }
}
