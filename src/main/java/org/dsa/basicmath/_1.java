package org.dsa.basicmath;

public class _1 {
    static void main() {
        int n = 12345;
        int count = 0;
        while (n != 0){
            n = n/10;
            count++;
        }
        System.out.println(count);
        System.out.println((int)Math.log10(12345)+1);
    }
}
