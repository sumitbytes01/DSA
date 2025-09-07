package org.dsa.recursion;

public class EightCheckIfStringIsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        String str = sb.toString().toLowerCase();
        System.out.println(str);
        int l = 0;
        int r = str.length()-1;
        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            }
            else{
                System.out.println("Not Palindrome");
                break;
            }
        }
        //palindrome recursion
        String s1 = "A man, a plan, a canal: Panama";
        boolean res = palindromeRecursionFunctional(s1, 0, s1.length()-1);
        System.out.println(res);
    }

    private static boolean palindromeRecursionFunctional(String str, int l, int r) {
        if(l>r)
            return true;
        if(str.charAt(l) != str.charAt(r))
            return false;
        return palindromeRecursionFunctional(str,l+1, r-1);
    }
}
