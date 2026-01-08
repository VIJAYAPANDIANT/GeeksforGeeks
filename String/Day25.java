/*Longest Prefix Suffix
Given a string s, of lowercase english alphabets, find the length of the longest proper prefix which is also a suffix.
Note: Prefix and suffix can be overlapping but they should not be equal to the entire string.

Examples :

Input: s = "abab"
Output: 2
Explanation: The string "ab" is the longest prefix and suffix. 
Input: s = "aabcdaabc"
Output: 4
Explanation: The string "aabc" is the longest prefix and suffix.
Input: s = "aaaa"
Output: 3
Explanation: "aaa" is the longest prefix and suffix.  */
/*class Solution {
    public int lps(String s) {
        int n = s.length();
        int[] lps = new int[n];

        int len = 0; // length of previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps[n - 1];
    }
}
 */
/*⏱ Time & Space Complexity
Metric	Complexity
Time	O(n)
Space	O(n) */