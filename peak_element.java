/* 
Problem statement
You are given an array 'arr' of length 'n'. 
Find the index(0-based) of a peak element in the array. If there are multiple peak numbers,
 return the index of any peak number.

Peak element is defined as that element that is greater than both of its neighbors. 
If 'arr[i]' is the peak element, 'arr[i - 1]' < 'arr[i]' and 'arr[i + 1]' < 'arr[i]'.

Assume 'arr[-1]' and 'arr[n]' as negative infinity.

Example:

Input: 'arr' = [1, 8, 1, 5, 3]

Output: 3

Explanation: There are two possible answers. 
Both 8 and 5 are peak elements, so the correct answers are their positions, 1 and 3.
*/

//Solution
import java.util.ArrayList;

public class peak_element {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2) {
            return 1;
        } else if (arr.get(0) > arr.get(1))
            return 0;
        else if (arr.get(n - 1) > arr.get(n - 2))
            return n - 1;
        else {
            int pi = -1;
            for (int i = 1; i < n - 1; i++) {
                if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                    pi = i;
                }
            }
            return pi;
        }
    }
};
