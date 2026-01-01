/*Anagram
Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

Examples:

Input: s1 = "geeks" s2 = "kseeg"
Output: true 
Explanation: Both the string have same characters with same frequency. So, they are anagrams.
Input: s1 = "allergy", s2 = "allergyy" 
Output: false 
Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams. 
Input: s1 = "listen", s2 = "lists" 
Output: false 
Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams. */
/*class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // Step 1: Length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] count = new int[26];

        // Step 3: Count characters in s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 4: Subtract characters in s2
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }

        // Step 5: Verify all counts are zero
        for (int freq : count) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }
}
 */
/*)
📌 Interview-Ready Answer

Time Complexity: O(n)
Space Complexity: O(1), since we use a fixed-size frequency array of 26 characters.
 */
