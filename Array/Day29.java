/*Min and Max in Array
Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

Examples:

Input: arr[] = [1, 4, 3, 5, 8, 6]
Output: [1, 8]
Explanation: minimum and maximum elements of array are 1 and 8.
Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: minimum and maximum element of array are 3 and 15. */
/*class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }
}
 */
/*Optimal Approach (O(n) Time, O(1) Space) */
