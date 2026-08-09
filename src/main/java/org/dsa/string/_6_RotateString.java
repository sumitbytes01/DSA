package org.dsa.string;

public class _6_RotateString {
    public static void main(String[] args) {
        String s = "rotation", goal = "tionrota";
        String g = goal;
        for(int i = 0; i<s.length();i++){
            g = rotateOnce(g);
            if(s.equals(g))
            {
                System.out.println("Strings are equal");
                break;
            }
        }
        // simple solution
        System.out.println(rotateAndCheck(s, goal));

        System.out.println(optimalApproach(s,goal));
    }

    private static boolean optimalApproach(String s, String goal) {
        System.out.println(s);
        System.out.println(goal);
        goal = goal+goal;
        if(goal.contains(s))
        {
            System.out.println("Strings are equal");
            return true;
        }
        return false;
    }

    private static boolean rotateAndCheck(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            System.out.println(s);
            s = s.substring(s.length()-1).concat(s.substring(0,s.length()-1));
            if(s.equals(goal))
            {
                System.out.println("Strings are equal");
                return true;
            }
        }
        return false;
    }

    private static String rotateOnce(String s) {
        char ch = s.charAt(0);
        return s.substring(1) + ch;
    }
}
