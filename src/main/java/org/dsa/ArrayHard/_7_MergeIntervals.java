package org.dsa.ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _7_MergeIntervals {
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

    private static int[][] bruteForce() {
        int[][] intervals = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        // sort the arrays based on the start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // iterate through the intervals and merge them if they overlap
        for(int i = 0; i< n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int j = i+1;
            // if the start time of the next interval is less than or equal to the end time of the current interval,
            // then we can merge them
            while(j<n && intervals[j][0]<=end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }
            result.add(new int[]{start, end});
            i = j-1;
        }
        return result.toArray(new int[result.size()][]);
    }
}
