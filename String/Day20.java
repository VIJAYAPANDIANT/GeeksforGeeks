/*Search Pattern
Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices.
Note: Return an empty list in case of no occurrences of pattern.

Examples :

Input: txt = "abcab", pat = "ab"
Output: [0, 3]
Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3. 
Input: txt = "abesdu", pat = "edu"
Output: []
Explanation: There's no substring "edu" present in txt.
Input: txt = "aabaacaadaabaaba", pat = "aaba"
Output: [0, 9, 12]
Explanation:
 */
/*import java.util.*;

class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();

        for (int i = 0; i <= n - m; i++) {
            if (txt.substring(i, i + m).equals(pat)) {
                result.add(i);
            }
        }
        return result;
    }
}
 */
/*🕒 Time & Space Complexity
Metric	Complexity
Time	O((n−m+1) × m)
Space	O(1) (excluding output list) */
