package org.dsa.basicmath;

public class _2 {
    static void main() {
        int n = 12345;
        int rev = 0;
        // Minimum value = -2,147,483,648
        // Maximum value =  2,147,483,647
        while(n!=0){
            int rem = n%10;
            if(rev> Integer.MAX_VALUE/10 ||(rev == Integer.MAX_VALUE/10 && rem>7))
            {
                System.out.println("Overflow");
                return;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && rem<-8))
            {
                System.out.println("Overflow");
                return;
            }
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);}
}
