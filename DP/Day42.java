/*Number of Valid Parentheses
You are given a number n, your task is to find the number of all the valid parentheses expressions of that length using only "(" and ")" brackets.

An input string of parentheses is valid if :

Open brackets must be closed in correct order.
Every close bracket has a corresponding open bracket.
For example - "()()" or "(())" are valid while ")()(" or "))((" are invalid parentheses expressions.

Examples:

Input: n = 2
Output: 1
Explanation: There is only one possibe valid expressions of length 2 i.e., "()".
Input: n = 4
Output: 2
Explanation: Possibe valid expressions of length 4 are "(())" and "()()".
Input: n = 6
Output: 5
Explanation: Possibe valid expressions of length 6 are "((()))", "(())()", "()(())", "()()()" and "(()())". */
/*class Solution {
    int findWays(int n) {
        // If length is odd, no valid parentheses possible
        if (n % 2 != 0) {
            return 0;
        }

        int pairs = n / 2;
        long[] dp = new long[pairs + 1];

        dp[0] = 1; // Base case

        for (int i = 1; i <= pairs; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }

        return (int) dp[pairs];
    }
}
 */
/*⏱️ Complexity

Time: O((n/2)²)

Space: O(n/2) */