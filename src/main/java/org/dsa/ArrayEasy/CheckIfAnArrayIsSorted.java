package org.dsa.ArrayEasy;

public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 1, 2, 3, 4};
        System.out.println(checkIfAnArrayIsSorted(arr1));
        System.out.println(checkIfAnArrayIsSorted(arr2));
        System.out.println(checkIfAnArrayIsSorted(arr3));
        System.out.println(checkIfAnArrayIsSorted(arr4));
    }

    private static boolean checkIfAnArrayIsSorted(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                count++;
        }
        if (count == 1 && arr[0] > arr[arr.length - 1])
            count--;
        return count == 0;
    }
}
