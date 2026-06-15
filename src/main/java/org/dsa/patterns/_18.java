package org.dsa.patterns;

public class _18 {
    static void main() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
