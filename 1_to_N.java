/* 
Problem statement
You are given an integer ‘n’.



Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.



Example:
Input: ‘n’ = 5

Output: 1 2 3 4 5

Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
*/

//Solution 

public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        recfunc(arr,x);
        return arr;

    }
    public static void recfunc(int arr[],int x){
        if(x==0)
            return ;
        arr[x-1]=x;
        recfunc(arr,x-1);
    }
}