package org.dsa.basicmath;

public class TwoReverseANumber {
    public static void main(String[] args) {
        //O(log10N + 1)
        int num = 40100;
        int res = 0;
        while (num!=0){
            int rem = num%10;
            res = (res*10)+rem;
            num = num/10;
        }
        System.out.println(res);}
}
