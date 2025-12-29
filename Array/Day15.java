/*Split array in three equal sum subarrays
Given an array, arr[], determine if arr can be split into three consecutive parts such that the sum of each part is equal. If possible, return any index pair(i, j) in an array such that sum(arr[0..i]) = sum(arr[i+1..j]) = sum(arr[j+1..n-1]), otherwise return an array {-1,-1}.

Note: Since multiple answers are possible, return any of them. The driver code will print true if it is correct otherwise, it will print false.

Examples :

Input:  arr[] = [1, 3, 4, 0, 4]
Output: true
Explanation: [1, 2] is valid pair as sum of subarray arr[0..1] is equal to sum of subarray arr[2..3] and also to sum of subarray arr[4..4]. The sum is 4, so driver code prints true.
Input: arr[] = [2, 3, 4]
Output: false
Explanation: No three subarrays exist which have equal sum.
Input: arr[] = [0, 1, 1]
Output: false
 */
/*// User function Template for Java
class Solution {

    public List<Integer> findSplit(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        int total = 0;
        for (int x : arr) total += x;

        // If total sum not divisible by 3
        if (total % 3 != 0) {
            result.add(-1);
            result.add(-1);
            return result;
        }

        int partSum = total / 3;
        int currSum = 0;
        int i = -1, j = -1;

        for (int k = 0; k < arr.length; k++) {
            currSum += arr[k];

            if (currSum == partSum && i == -1) {
                i = k;
            } 
            else if (currSum == 2 * partSum && i != -1) {
                j = k;
                break;
            }
        }

        if (i != -1 && j != -1) {
            result.add(i);
            result.add(j);
        } else {
            result.add(-1);
            result.add(-1);
        }

        return result;
    }
}
 */
/*int[] splitArray(int[] arr, int n) {
    int total = 0;
    for (int x : arr) total += x;

    if (total % 3 != 0)
        return new int[]{-1, -1};

    int partSum = total / 3;
    int currSum = 0;
    int i = -1, j = -1;

    for (int k = 0; k < n; k++) {
        currSum += arr[k];

        if (currSum == partSum && i == -1) {
            i = k;
        } 
        else if (currSum == 2 * partSum && i != -1) {
            j = k;
            break;
        }
    }

    if (i != -1 && j != -1)
        return new int[]{i, j};

    return new int[]{-1, -1};
}
 */
/*⏱ Complexity

Time: O(n)

Space: O(1) (excluding output list) */