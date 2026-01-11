/*Minimum repeat to make substring
Given two strings s1 and s2. Return a minimum number of times s1 has to be repeated such that s2 is a substring of it. If s2 can never be a substring then return -1.

Note: Both the strings contain only lowercase letters.

Examples:

Input: s1 = "ww", s2 = "www"
Output: 2
Explanation: Repeating s1 two times "wwww", s2 is a substring of it.
Input: s1 = "abac", s2 = "cabaca" 
Output: 3 
Explanation: Repeating s1 three times "abacabacabac", s2 is a substring of it. s2 is not a substring of s1 when it is repeated less than 3 times.
Input: s1 = "ab", s2 = "cab"
Output: -1
Explanation: No matter how many times we repeat s1, we can't get a string such that s2 is a substring of it. */
/*class Solution {
    public int repeatedStringMatch(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < s2.length()) {
            sb.append(s1);
            count++;
        }

        if (kmpSearch(sb.toString(), s2)) {
            return count;
        }

        sb.append(s1);
        count++;

        if (kmpSearch(sb.toString(), s2)) {
            return count;
        }

        return -1;
    }

    // KMP Pattern Search
    private boolean kmpSearch(String text, String pattern) {
        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return true;
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    // Build LPS Array
    private int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
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
        return lps;
    }
}
 */
/*⏱️ Complexity (Optimized)

Time: O(n + m)

Space: O(m)

Where:

n = length of repeated string

m = length of s2 */

