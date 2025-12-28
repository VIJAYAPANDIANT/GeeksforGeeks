/*Smallest Positive Missing
You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1. The array can have negative integers too.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.
Input: arr[] = [5, 3, 2, 5, 1]
Output: 4
Explanation: Smallest positive missing number is 4.
Input: arr[] = [-8, 0, -1, -4, -3]
Output: 1
Explanation: Smallest positive missing number is 1. */
/* 
class Solution {
    int missingNumber(int arr[], int n) {
        // Your code here
        boolean[] present = new boolean[n + 1];
        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }
}*/ /*class Solution {
    public int smallestMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Replace invalid numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Step 2: Mark presence
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num >= 1 && num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // Step 3: Find missing
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
 */