/* 
Problem statement
A prime number is a positive integer that is divisible by exactly 2 integers, 1 and the number itself.



You are given a number 'n'.



Find out whether 'n' is prime or not.



Example :
Input: 'n' = 5

Output: YES
*/

//Solution

public class prime {
    public static String isPrime(int num) {
        // Your code goes here
        int c = 0;
        if (num == 1)
            return "NO";
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0)
            return "YES";
        return "NO";
    }
}
