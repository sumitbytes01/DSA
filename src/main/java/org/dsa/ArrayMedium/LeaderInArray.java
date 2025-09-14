package org.dsa.ArrayMedium;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        // O(n^2)
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println(arr[i]+" is leader");
        }
        //O(n)
        int max = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i] > max)
            {
                System.out.println(arr[i]+" is the leader");
                max = arr[i];
            }

        }

    }
}
