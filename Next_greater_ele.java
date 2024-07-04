/* 
Problem statement
You are given an array 'a' of size 'n'.



Print the Next Greater Element(NGE) for every element.



The Next Greater Element for an element 'x' is the first element on the right side of 'x' in the array, which is greater than 'x'.



If no greater elements exist to the right of 'x', consider the next greater element as -1.
*/

import java.util.*;

public class Next_greater_ele {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.

        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = (n - 1); i >= 0; i--) {

            while (!st.isEmpty() && arr[i] >= st.peek()) {

                st.pop();

            }

            if (st.isEmpty()) {

                nge[i] = -1;

            } else {

                nge[i] = st.peek();

            }

            st.push(arr[i]);

        }

        return nge;

    }

}
