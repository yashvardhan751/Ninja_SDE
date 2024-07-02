/*
 
 Problem statement
You are given a string 'str' of length 'N'.



Your task is to reverse the original string word by word.



There can be multiple spaces between two words and there can be leading or
 trailing spaces but in the output reversed string you need to put a single space between two words,
 and your reversed string should not contain leading or trailing spaces.

 */

//Solution

public class reverseWord {
    public static String reverseString(String str) {
        // Write your code here
        String s[] = str.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            ans = ans.append(s[i]).append(" ");
        }
        return ans.toString();
    }
}
