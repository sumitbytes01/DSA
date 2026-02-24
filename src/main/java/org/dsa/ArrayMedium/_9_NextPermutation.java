package org.dsa.ArrayMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _9_NextPermutation {
    // Function to generate all possible permutations
    static void generatePermutations(List<List<Integer>> res,
                                     int[] arr, int idx) {

        // Base case: if idx reaches the end of array
        if (idx == arr.length - 1) {
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) temp.add(x);
            res.add(temp);
            return;
        }

        // Generate all permutations by swapping
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);

            // Recur for the next index
            generatePermutations(res, arr, idx + 1);

            // Backtrack to restore original array
            swap(arr, idx, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // Function to find the next permutation
    static void nextPermutation(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();

        // Generate all permutations
        generatePermutations(res, arr, 0);

        // Sort all permutations lexicographically
        Collections.sort(res, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Find the current permutation index
        for (int i = 0; i < res.size(); i++) {

            // If current permutation matches input
            boolean match = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != res.get(i).get(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {

                // If it's not the last permutation
                if (i < res.size() - 1) {
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = res.get(i + 1).get(j);
                    }
                }

                // If it's the last permutation
                else {
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = res.get(0).get(j);
                    }
                }

                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 7, 5, 0};

        nextPermutation(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

