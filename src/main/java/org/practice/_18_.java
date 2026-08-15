package org.practice;

public class _18_ {
    static void main() {
        int n = 5;
        char endChar = 'E';
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (endChar-i); ch <=endChar; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
