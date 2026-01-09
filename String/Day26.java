/*Add Binary Strings
Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100
Input: s1 = "00100", s2 = "010"
Output: 110
Explanation: 
  100
+  10
  110 */
  /*class Solution {
    public String addBinary(String s1, String s2) {

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        // Reverse result
        result.reverse();

        // Remove leading zeros
        int idx = 0;
        while (idx < result.length() - 1 && result.charAt(idx) == '0') {
            idx++;
        }

        return result.substring(idx);
    }
}
 */
/*⏱ Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(n)

where n = max(s1.length(), s2.length()) */