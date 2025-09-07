package org.dsa.basicmath;

public class ThreeCheckPalindrome {

    public static void main(String[] args) {
        //O(log10N + 1)
        int num = 4554;
        int tempNum = num;
        int rev = 0;
        while (tempNum != 0) {
            int rem = tempNum % 10;
            rev = rev * 10 + rem;
            tempNum = tempNum / 10;
        }
        System.out.println(rev==num);}
}
