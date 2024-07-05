/* 
Problem statement
You are given an integer array 'A' of size 'N', sorted in non-decreasing order. 
You are also given an integer 'target'. 
Your task is to write a function to search for 'target' in the array 'A'.
 If it exists, return its index in 0-based indexing.
 If 'target' is not present in the array 'A', return -1.
 */

//Solution
public class binary {
    public static int search(int[] nums, int target) {
        // Write your code here.
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}