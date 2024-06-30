/*
    Problem statement
Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.

 */

 //Solution

 public class Palindrome{
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int n=str.length()-1;
        return rev(str,0,n);
    }
    public static boolean rev(String str,int x,int n){
        if(x>n){
            return true;
        }
        if(str.charAt(x)==str.charAt(n)){
            return rev(str,x+1,n-1);
        }
        return false;
    }
}
