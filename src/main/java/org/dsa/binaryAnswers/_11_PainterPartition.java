package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _11_PainterPartition {
    static void main() {
        int[] boards = {5, 5, 5, 5};
        int painters = 2;
        /*Brute Force: O((sum - max + 1) * n)
        Optimal: O(n * log(sum - max))*/
        System.out.println(bruteForcePaint(boards, painters));
        System.out.println(OptimalPainter(boards, painters));
        
    }

    private static int OptimalPainter(int[] boards, int painters) {
        int low = Arrays.stream(boards).max().getAsInt();
        if(painters>boards.length)
            return low;
        int high = Arrays.stream(boards).sum();
        while(low<=high) {
            int mid = low + (high - low) / 2;
            boolean isPainterPossible = isPossiblePainters(boards, painters, mid);
            if (isPainterPossible) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int bruteForcePaint(int[] boards, int painters) {
        if(painters>boards.length)
            return -1;
        int min = Arrays.stream(boards).max().getAsInt();
        int max = Arrays.stream(boards).sum();
        for (int i = min; i <= max; i++) {
            boolean isPainterPossible = isPossiblePainters(boards, painters, i);
            if(isPainterPossible){
                return i;
            }
        }
    return -1;
    }

    private static boolean isPossiblePainters(int[] boards, int painters, int maxBoards) {
        int totalBoard = 0;
        int count = 1;
        for (int i = 0; i < boards.length; i++) {
            if(totalBoard+boards[i]<=maxBoards){
                totalBoard += boards[i];
            }
            else {
                count++;
                totalBoard = boards[i];
                if(count>painters)
                    return false;
            }
        }
    return true;
    }
}
