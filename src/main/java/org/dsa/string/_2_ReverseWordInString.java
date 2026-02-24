package org.dsa.string;

public class _2_ReverseWordInString {
    public static void main(String[] args) {
        String str = "Hello World from DSA";
        String str1 = "a good   example";
        String reversed = reverseWords(str);
        System.out.println(reversed); // Output: "DSA from World Hello"
        String reversed2 = reverseWords(str1);
        System.out.println(reversed2);

        System.out.println(reverseWordsNew(str));
    }

    private static String reverseWordsNew(String str) {
        StringBuilder sb = new StringBuilder();
        int i = str.length()-1;
        while(i>=0){
            // remove spaces from back side of the string.
            while (i>=0 && str.charAt(i) == ' ')
                i--;

            // If pointer goes out of bounds, break
            if (i < 0) break;

            // end of the word detected
            int end = i;

            // find start of the word
            while(i>=0 && str.charAt(i) != ' ')
                i--;

            String word = str.substring(i+1, end+1);

            if(sb.length()>0)
                sb.append(" ");
            sb.append(word);
        }
        return sb.toString();
    }

    private static String reverseWords(String s){
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >=0 ; i--) {
            if(strArr[i].trim().length()>0)
                sb.append(strArr[i].trim().concat(" "));
        }
    return sb.toString().trim();
    }
}
