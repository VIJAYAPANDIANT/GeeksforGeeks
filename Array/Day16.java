/*Maximize Number of 1's
Given a binary array arr[] containing only 0s and 1s and an integer k, you are allowed to flip at most k 0s to 1s. Find the maximum number of consecutive 1's that can be obtained in the array after performing the operation at most k times. 
Examples:

Input: arr[] = [1, 0, 1], k = 1
Output: 3
Explanation: By flipping the zero at index 1, we get the longest subarray from index 0 to 2 containing all 1’s.
Input: arr[] = [1, 0, 0, 1, 0, 1, 0, 1], k = 2
Output: 5
Explanation: By flipping the zeroes at indices 4 and 6, we get the longest subarray from index 3 to 7 containing all 1’s.
Input: arr[] = [1, 1], k = 2
Output: 2
Explanation: Since the array is already having the max consecutive 1's, hence we dont need to perform any operation. Hence the answer is 2.*/
/*class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int left=0,zerocount=0,maxlen=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(arr[left]==0){
                 zerocount--;   
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
} */
/*Time & Space Complexity

Time: O(n)

Space: O(1) */
