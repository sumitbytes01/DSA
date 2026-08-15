package org.practice;

public class _14_ {

    static void main() {

        int rows = 5;
        char startCharacter = 'A';
        for (int row = 0; row < rows; row++) {
            for (char ch = startCharacter; ch <= startCharacter+row; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}