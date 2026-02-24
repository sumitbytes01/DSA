package org.dsa.basicmath;

public class _2_ReverseANumber {
    public static void main(String[] args) {
        //O(log10N + 1)
        Integer res = reverse();
        System.out.println(res);}

    private static Integer reverse() {
        int num = 40100;
        int res = 0;
        while (num!=0){
            int rem = num%10;
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && rem >7))
                return null;
            if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && rem <-8))
                return 0;
            res = (res*10)+rem;
            num = num/10;
        }
        return res;
    }
}
