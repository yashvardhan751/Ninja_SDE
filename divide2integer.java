/*
 Problem statement
You are given two integers, ‘dividend’ and ‘divisor’.



You are required to divide the integers without using multiplication, division, and modular operators.



Your task is to return the quotient after dividing ‘dividend’ by ‘divisor’.



Note :

In cases where the dividend is not perfectly divisible by the divisor, you are required to return the integer value of the quotient which is closer to zero.

For example - If the answer is '8.34', we return the integer part, i.e., '8'. Also, If the answer is '-2.67', we return the integer part, i.e., '-2'.

Assume we're dealing with a system that can only store integers in the 32-bit signed integer range: [2^31, 2^31-1]. If the quotient is higher than 2^31 - 1, return 2^31 - 1; if it is less than -2^31, return -2^31. 
For example :

If the answer is ‘9.333’, then return ‘9’, or if the answer is ‘-8.123’, then return ‘-8’.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
10 3
Sample Output 1:
3
Explanation of sample input 1:
Given ‘dividend = 10’ and ‘divisor = 3’

So the division is ‘10/3 = 3.3333……’.

Return only integer part ‘3’
Sample Input 2:
7 -3
Sample Output 2:
-2
Constraints:
-10^9 <= dividend, divisor <= 10^9 
divisor != 0  

Time limit: 1 second
*/

//Solution

public class Divide2Integer {
    public static int divideTwoInteger(int dividend, int divisor) {
        // Write your code here.
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);

        divisor = Math.abs(divisor);

        int res = 0;

        while (dividend >= divisor) {

            int count = 0;

            while (dividend >= (divisor << count + 1)) {

                count++;

            }

            res += 1 << count;

            dividend -= divisor << (count);

        }

        return sign * res;
    }
}