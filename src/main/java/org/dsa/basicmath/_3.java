package org.dsa.basicmath;

public class _3 {
    static void main() {
        int num = 4554;
        int n = num;
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev == n);
    }
}
