/*
Problem statement
You are given two integers 'n', and 'm'.

Calculate 'gcd(n,m)', without using library functions.

Note:
The greatest common divisor (gcd) of two numbers 'n' and 'm' is the largest positive number that divides
both 'n' and 'm' without leaving a remainder.

*/

//solution

public class gcd {
    public static int calcGCD(int n, int m) {
        // Write your code here.
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}
