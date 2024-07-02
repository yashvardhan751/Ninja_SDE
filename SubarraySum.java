/* 
Problem statement
Ninja and his friend are playing a game of subarrays. They have an array ‘NUMS’ of length ‘N’. Ninja’s friend gives him an arbitrary integer ‘K’ and asks him to find the length of the longest subarray in which the sum of elements is equal to ‘K’.

Ninjas asks for your help to win this game. Find the length of the longest subarray in which the sum of elements is equal to ‘K’.

If there is no subarray whose sum is ‘K’ then you should return 0.

Example:
Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]
*/

//Solution

import java.util.*;
import java.io.*;

public class subarraySum {
    public static int getLongestSubarray(int[] nums, int k) {
        // Write your code here.
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int sum = 0, len = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (mp.containsKey(sum - k)) {
                len = Math.max(len, i - mp.get(sum - k));
            }
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }
        return len;

    }
}