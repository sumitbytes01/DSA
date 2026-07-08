package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _9_AllocateBooks {
    static void main() {
        int[] books = {12, 34, 67, 90};
        int students = 2;
        /*Method
        Time Complexity
        Brute Force
        O((sum-max) × n)
        Binary Search
        O(n log(sum-max))*/
        System.out.println(bruteAllocate(books, students));
        System.out.println(optimalAllocate(books, students));
    }

    private static int optimalAllocate(int[] books, int students) {
        if (students > books.length)
            return -1;
        int min = Arrays.stream(books).max().getAsInt();
        int max = Arrays.stream(books).sum();
        while(min<=max){
            int mid = min + (max-min)/2;
            boolean isPossible = isPossible(books, students, mid);
            if(isPossible){
                max = mid-1;
            }
            else min = mid+1;
        }
        return min;
    }

    private static int bruteAllocate(int[] books, int students) {
        if (students > books.length)
            return -1;
        int min = Arrays.stream(books).max().getAsInt();
        int max = Arrays.stream(books).sum();
        for (int i = min; i <= max; i++) {
            boolean res = isPossible(books, students, i);
            if (res) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isPossible(int[] books, int students, int pages) {
        int count = 1;
        int pagesStudent = 0;
        for (int i = 0; i < books.length; i++) {
            if (pagesStudent + books[i] <= pages) {
                pagesStudent = pagesStudent + books[i];

            } else {
                count++;
                pagesStudent = books[i];
                if (count > students)
                    return false;
            }
        }
        return true;
    }
}
