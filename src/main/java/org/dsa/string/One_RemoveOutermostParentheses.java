package org.dsa.string;

public class One_RemoveOutermostParentheses {
    public static void main(String[] args) {
        One_RemoveOutermostParentheses rop = new One_RemoveOutermostParentheses();
        String s = "(()())(())";
        System.out.println(rop.removeOuterParentheses(s));

        System.out.println(rop.removeOuterParenthesesSimple(s));
    }

    private String removeOuterParenthesesSimple(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == ')')
                counter--;
            if(counter != 0){
                sb.append(ch);
            }
            if(ch == '(')
                counter++;
        }
        return sb.toString();
    }

    public static String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder answer = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch == '(' && counter++>0)
                answer.append(ch);
            else if (ch == ')' && counter-- >1)
                answer.append(ch);
        }
        return answer.toString();}
}
