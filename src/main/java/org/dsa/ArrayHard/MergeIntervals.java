package org.dsa.ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        bruteForce();
        System.out.println("=================");
        optimalSolution();
    }

    private static void optimalSolution() {
        int[][] intervals = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
        List<int[]> answer = new ArrayList<>();
        for (int[] interval : intervals) {
            if (answer.isEmpty() || answer.getLast()[1] < interval[0]) {
                answer.add(interval);
            } else {
                int maxEnd = Math.max(answer.getLast()[1], interval[1]);
                answer.getLast()[1] = maxEnd;
            }
        }
        answer.forEach(o -> Arrays.stream(o).forEach(System.out::println));
    }

    private static void bruteForce() {
        int[][] intervals = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        // Sort intervals by start (important for merging)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int len = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        System.out.println(len);
        while (i < len) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i + 1;

            // check all overlapping intervals
            while (j < len && intervals[j][0] <= end) {
                // extent the end of current interval
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            // Add merged interval to result
            ans.add(new int[]{start, end});
            i = j;
        }
        ans.forEach(o -> Arrays.stream(o).forEach(System.out::println));
    }
}
