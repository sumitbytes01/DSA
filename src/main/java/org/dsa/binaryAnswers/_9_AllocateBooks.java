package org.dsa.binaryAnswers;

import java.util.Arrays;

public class _9_AllocateBooks {
    static void main() {
        int[] books = {12, 34, 67, 90};
        int students = 2;
        System.out.println(bruteAllocate(books, students));
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
