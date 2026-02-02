/*Array End Insert
Given an array arr that is not completely filled and a value val, you have to insert the value at the end of the array.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], val = 90
Output: [1, 2, 3, 4, 5, 90]
Explanation: After inserting 90 at the end, we have array elements as 1 2 3 4 5 90.
Input: arr[] = [1, 2, 3], val = 50
Output: [1, 2, 3, 50]
Explanation: After inserting 50 at the end, we have array elements as 1 2 3 50. */
/* */
/*class Solution {
    int[] insertAtEnd(int arr[], int val, int n) {
        // code here
        arr[n] = val;
        return arr;
    }
}*/
/*class Solution {
    public void insertAtEnd(ArrayList<Integer> arr, int val) {
        arr.add(val);
    }
}
 */
/*⏱ Complexity

Time: O(1) (amortized)

Space: O(1) extra space */