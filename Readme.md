# GeeksforGeeks 50 Days of DSA Challenge - Java Solutions

## 📋 Overview

This repository contains my solutions to the **GeeksforGeeks 50 Days of DSA** challenge in Java. Each solution includes a step-by-step logic explanation and complexity analysis.

---
## Topic

- **🔹 Array**
- **🔹 String**
- **🔹 Dynamic Programming**

---

## 📂 Day-by-Day Solutions

### Day 1: [Second Largest](file:///c:/GeeksforGeeks/Array/Day1.java)

- **Problem:** Find the second largest element in a positive integer array. If it doesn't exist, return -1.
- **Step-by-Step Logic:**
  1. Initialize `largest = -1` and `secondLargest = -1`.
  2. Traverse the array.
  3. If current number > `largest`, update `secondLargest = largest` and `largest = current`.
  4. If current number < `largest` but > `secondLargest`, update `secondLargest = current`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 2: [Reverse an Array](file:///c:/GeeksforGeeks/Array/Day2.java)

- **Problem:** Reverse the given array in-place.
- **Step-by-Step Logic:**
  1. Use two pointers: `left` at 0 and `right` at $n-1$.
  2. Swap elements at `left` and `right`.
  3. Increment `left` and decrement `right` until they meet.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 3: [Move All Zeroes to End](file:///c:/GeeksforGeeks/Array/Day3.java)

- **Problem:** Move all 0s to the end while maintaining the relative order of non-zero elements.
- **Step-by-Step Logic:**
  1. Maintain a pointer `j` for the position of the next non-zero element.
  2. Traverse the array; if current element is non-zero, move it to `arr[j]` and increment `j`.
  3. Fill the rest of the array (from `j` onwards) with 0s.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 4: [Rotate Array](file:///c:/GeeksforGeeks/Array/Day4.java)

- **Problem:** Rotate the array counter-clockwise by `d` steps.
- **Step-by-Step Logic:**
  1. Calculate `d = d % n`.
  2. Use the "Reversal Algorithm":
     - Reverse the first `d` elements.
     - Reverse the remaining `n-d` elements.
     - Reverse the whole array.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 5: [Next Permutation](file:///c:/GeeksforGeeks/Array/Day5.java)

- **Problem:** Find the lexicographically next greater permutation.
- **Step-by-Step Logic:**
  1. Find the first element from the right that is smaller than its neighbor (`pivot`).
  2. If no pivot exists, reverse the whole array.
  3. Otherwise, find the smallest element to the right of the pivot that is larger than the pivot.
  4. Swap them and reverse the suffix after the pivot position.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 6: [Stock Buy and Sell – Max one Transaction](file:///c:/GeeksforGeeks/Array/Day6.java)

- **Problem:** Find max profit with at most one buy and one sell.
- **Step-by-Step Logic:**
  1. Track the `minPrice` seen so far.
  2. Calculate profit at each step as `currentPrice - minPrice`.
  3. Update `maxProfit` if the current profit is higher.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 7: [Majority Element - More Than n/3](file:///c:/GeeksforGeeks/Array/Day7.java)

- **Problem:** Find all elements that appear more than $\lfloor n/3 \rfloor$ times.
- **Step-by-Step Logic (Boyer-Moore Voting):**
  1. Identify at most two potential candidates and their counts.
  2. Verify candidates by counting their actual occurrences in a second pass.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 8: [Kadane's Algorithm](file:///c:/GeeksforGeeks/Array/Day8.java)

- **Problem:** Find the maximum sum of a continuous subarray.
- **Step-by-Step Logic:**
  1. Maintain `currentSum` and `maxSum`.
  2. At each step: `currentSum = max(arr[i], currentSum + arr[i])`.
  3. Update `maxSum = max(maxSum, currentSum)`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 9: [Stock Buy and Sell – Multiple Transaction](file:///c:/GeeksforGeeks/Array/Day9.java)

- **Problem:** Maximize profit with any number of transactions.
- **Step-by-Step Logic:**
  1. Accumulate all positive price differences between consecutive days.
  2. `profit += max(0, prices[i] - prices[i-1])`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 10: [Maximum Product Subarray](file:///c:/GeeksforGeeks/Array/Day10.java)

- **Problem:** Find the maximum product of a subarray.
- **Step-by-Step Logic:**
  1. Track `maxEnding` and `minEnding` at each position.
  2. When encountering a negative number, swap `maxEnding` and `minEnding`.
  3. Update global `result` at each step.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 11: [Minimize the Heights II](file:///c:/GeeksforGeeks/Array/Day11.java)

- **Problem:** Minimize difference between max and min height after $\pm k$ transformation.
- **Step-by-Step Logic:**
  1. Sort the array.
  2. Initially, `ans = arr[n-1] - arr[0]`.
  3. Explore splitting points where elements before are increased and after are decreased.
- **Complexity:** Time: $O(n \log n)$, Space: $O(1)$.

### Day 12: [Smallest Positive Missing](file:///c:/GeeksforGeeks/Array/Day12.java)

- **Problem:** Find the smallest missing positive integer.
- **Step-by-Step Logic:**
  1. Clean the array (treat numbers $\le 0$ as $n+1$).
  2. Mark presence of numbers by using indices and negate values.
  3. First positive value index + 1 is the missing number.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 13: [Repetitive Addition of Digits](file:///c:/GeeksforGeeks/Array/Day13.java)

- **Problem:** Sum digits until a single digit remains.
- **Step-by-Step Logic:** Repeatedly extract digits using modulo/division and sum them.
- **Complexity:** Time: $O(\log_{10} n)$, Space: $O(1)$.

### Day 14: [Last Moment Before Ants Fall Out](file:///c:/GeeksforGeeks/Array/Day14.java)

- **Problem:** Find time when last ant falls.
- **Step-by-Step Logic:** Directions change doesn't matter; effective time is just the maximum distance any ant has to travel to its nearest edge.
- **Complexity:** Time: $O(L+R)$, Space: $O(1)$.

### Day 15: [Split Array in Three Equal Sum Subarrays](file:///c:/GeeksforGeeks/Array/Day15.java)

- **Problem:** Find two indices to split array into three equal sum parts.
- **Step-by-Step Logic:** Check if `totalSum % 3 == 0`. Trap cumulative sums that match `partSum` and `2*partSum`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 16: [Maximize Number of 1's](file:///c:/GeeksforGeeks/Array/Day16.java)

- **Problem:** Max consecutive 1s after flipping at most `k` zeros.
- **Step-by-Step Logic:** Use a sliding window to maintain at most `k` zeros.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 17: [Max Circular Subarray Sum](file:///c:/GeeksforGeeks/Array/Day17.java)

- **Problem:** Find max subarray sum in a circular array.
- **Step-by-Step Logic:** Result is `max(Standard Kadane's, Total Sum - Min Subarray Sum)`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 18: [Anagram](file:///c:/GeeksforGeeks/String/Day18.java)

- **Problem:** Check if two strings are anagrams.
- **Step-by-Step Logic:** Use a frequency array (size 26) to count characters in `s1` and decrement for `s2`. Check if all counts are zero.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 19: [Non Repeating Character](file:///c:/GeeksforGeeks/String/Day19.java)

- **Problem:** Find the first character that does not repeat.
- **Step-by-Step Logic:** Count frequencies of all characters, then traverse the string to find the first character with frequency 1.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 20: [Search Pattern](file:///c:/GeeksforGeeks/String/Day20.java)

- **Problem:** Find all indices of pattern `pat` in text `txt`.
- **Step-by-Step Logic:** Use built-in `indexOf` or a sliding window string comparison.
- **Complexity:** Time: $O(n \cdot m)$, Space: $O(1)$.

### Day 21: [Min Chars to Add for Palindrome](file:///c:/GeeksforGeeks/String/Day21.java)

- **Problem:** Min characters to add at front for a palindrome.
- **Step-by-Step Logic:** Construct `temp = s + "#" + rev(s)`. Use the LPS (Longest Prefix Suffix) array of KMP to find the longest palindromic prefix.
- **Complexity:** Time: $O(n)$, Space: $O(n)$.

### Day 22: [Fizz Buzz](file:///c:/GeeksforGeeks/String/Day22.java)

- **Problem:** Classic FizzBuzz for numbers 1 to $n$.
- **Step-by-Step Logic:** Iterate and check divisibility by 3, 5, or both (15).
- **Complexity:** Time: $O(n)$, Space: $O(n)$.

### Day 23: [Palindrome Sentence](file:///c:/GeeksforGeeks/String/Day23.java)

- **Problem:** Check if sentence is palindrome after cleaning.
- **Step-by-Step Logic:** Use two pointers on the original string, skipping non-alphanumeric characters and comparing lowercase versions.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 24: [CamelCase Pattern Matching](file:///c:/GeeksforGeeks/String/Day24.java)

- **Problem:** Match words in dictionary with uppercase patterns.
- **Step-by-Step Logic:** Extract uppercase letters from each word and check if the pattern is a prefix of those capitals.
- **Complexity:** Time: $O(N \cdot L)$, Space: $O(L)$.

### Day 25: [Longest Prefix Suffix](file:///c:/GeeksforGeeks/String/Day25.java)

- **Problem:** Find length of longest proper prefix which is also a suffix.
- **Step-by-Step Logic:** Building the LPS array as used in KMP pattern searching.
- **Complexity:** Time: $O(n)$, Space: $O(n)$.

### Day 26: [Add Binary Strings](file:///c:/GeeksforGeeks/String/Day26.java)

- **Problem:** Sum two binary strings and return result without leading zeros.
- **Step-by-Step Logic:** Use a carry variable, add digits from right to left, and reverse the final result.
- **Complexity:** Time: $O(n)$, Space: $O(n)$.

### Day 27: [Implement Atoi](file:///c:/GeeksforGeeks/String/Day27.java)

- **Problem:** Convert string to integer.
- **Step-by-Step Logic:** Handle whitespace, signs, and digit overflow carefully during the numeric conversion.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 28: [Minimum repeat to make substring](file:///c:/GeeksforGeeks/String/Day28.java)

- **Problem:** Min repeats of `s1` so `s2` becomes a substring.
- **Step-by-Step Logic:** Repeat `s1` until its length $\ge s2$. Check if `s2` is present. If not, repeat once more and check. Otherwise, not possible.
- **Complexity:** Time: $O(n+m)$, Space: $O(m)$.

### Day 29: [Min and Max in Array](file:///c:/GeeksforGeeks/Array/Day29.java)

- **Problem:** Find both min and max elements in a single pass.
- **Step-by-Step Logic:** Initialize `min` and `max` with first element, then update during traversal.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 30: [Indexes of Subarray Sum](file:///c:/GeeksforGeeks/Array/Day30.java)

- **Problem:** Find first continuous subarray matching `target`.
- **Step-by-Step Logic:** Sliding window (two pointers) to find a range whose sum equals `target`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 31: [Minimum Jumps](file:///c:/GeeksforGeeks/Array/Day31.java)

- **Problem:** Min jumps to reach the end.
- **Step-by-Step Logic:** Greedy approach tracking `maxReach`, `steps` available, and `jumps`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 32: [Array Leaders](file:///c:/GeeksforGeeks/Array/Day32.java)

- **Problem:** Find all elements greater than or equal to all elements to their right.
- **Step-by-Step Logic:** Traverse from right to left, tracking the `maxFromRight`.
- **Complexity:** Time: $O(n)$, Space: $O(n)$ for output.

### Day 33: [Array Duplicates](file:///c:/GeeksforGeeks/Array/Day33.java)

- **Problem:** Find all integers appearing twice in range [1, n].
- **Step-by-Step Logic:** Use the sign-flipping trick: use `abs(arr[i]) - 1` as index and negate `arr[index]`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 34: [Sort 0s, 1s and 2s](file:///c:/GeeksforGeeks/Array/Day34.java)

- **Problem:** Segregate 0s, 1s, and 2s without built-in sort.
- **Step-by-Step Logic:** Dutch National Flag algorithm using `low`, `mid`, and `high` pointers.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 35: [Kth Smallest](file:///c:/GeeksforGeeks/Array/Day35.java)

- **Problem:** Find the $k$-th smallest element in an array.
- **Step-by-Step Logic:** QuickSelect algorithm (average $O(n)$) or PriorityQueue ($O(n \log k)$).
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 36: [Parenthesis Checker](file:///c:/GeeksforGeeks/Array/Day36.java)

- **Problem:** Determine if bracket expression is balanced.
- **Step-by-Step Logic:** Use a Stack to push opening brackets and pop/check on closing brackets.
- **Complexity:** Time: $O(n)$, Space: $O(n)$.

### Day 37: [Missing And Repeating](file:///c:/GeeksforGeeks/Array/Day37.java)

- **Problem:** Find one missing and one repeating number in [1, n].
- **Step-by-Step Logic:** Use sign-flipping to find repeating, then find the index with positive value for missing.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 38: [Array Search](file:///c:/GeeksforGeeks/Array/Day38.java)

- **Problem:** Find the first occurrence of an element.
- **Step-by-Step Logic:** Linear search.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 39: [Array Subset](file:///c:/GeeksforGeeks/Array/Day39.java)

- **Problem:** Determine if child array `b` is a subset of `a`.
- **Step-by-Step Logic:** Use frequency map of `a` and decrement/check while traversing `b`.
- **Complexity:** Time: $O(n)$, Space: $O(n)$.

### Day 40: [Detect Loop in Linked List](file:///c:/GeeksforGeeks/Array/Day40.java)

- **Problem:** Check for cycles in a singly linked list.
- **Step-by-Step Logic:** Floyd’s Cycle-Finding Algorithm (slow and fast pointers).
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 41: [BFS of graph](file:///c:/GeeksforGeeks/Array/Day41.java)

- **Problem:** Breadth First Search traversal from node 0.
- **Step-by-Step Logic:** Use a Queue and a `visited` array.
- **Complexity:** Time: $O(V+E)$, Space: $O(V)$.

### Day 42: [Number of Valid Parentheses](file:///c:/GeeksforGeeks/DP/Day42.java)

- **Problem:** Find count of valid parentheses of length `n`.
- **Step-by-Step Logic:** This is equivalent to finding the $\frac{n}{2}$-th Catalan Number. Use DP to build the solution from base cases.
- **Complexity:** Time: $O(n^2)$, Space: $O(n)$.

### Day 43: [Missing in Array](file:///c:/GeeksforGeeks/Array/Day43.java)

- **Problem:** Find one missing number in [1, n].
- **Step-by-Step Logic:** Sum of first $n$ numbers minus actual sum, OR XOR all elements and numbers.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 44: [Equilibrium Point](file:///c:/GeeksforGeeks/Array/Day44.java)

- **Problem:** Find index where left sum equals right sum.
- **Step-by-Step Logic:** Calculate `totalSum`, then traverse while maintaining `leftSum` and calculating `rightSum = totalSum - leftSum - current`.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 45: [Floor in a Sorted Array](file:///c:/GeeksforGeeks/Array/Day45.java)

- **Problem:** Index of largest element $\le x$.
- **Step-by-Step Logic:** Binary Search for the rightmost element meeting the condition.
- **Complexity:** Time: $O(\log n)$, Space: $O(1)$.

### Day 46: [Largest in Array](file:///c:/GeeksforGeeks/Array/Day46.java)

- **Problem:** Return the max element.
- **Step-by-Step Logic:** Linear traversal with `max` variable.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 47: [Value equal to index value](file:///c:/GeeksforGeeks/Array/Day47.java)

- **Problem:** Find indices such that `arr[i] == i`.
- **Step-by-Step Logic:** Single pass check.
- **Complexity:** Time: $O(n)$, Space: $O(1)$.

### Day 48: [Alternate Positive Negative](file:///c:/GeeksforGeeks/Array/Day48.java)

- **Problem:** Rearrange array with alternating signs.
- **Step-by-Step Logic:** Separate positives and negatives into two lists, then merge.
- **Complexity:** Time: $O(n)$, Space: $O(n)$.

### Day 49: [Two Stacks in an Array](file:///c:/GeeksforGeeks/Array/Day49.java)

- **Problem:** Implement two stacks in one array efficiently.
- **Step-by-Step Logic:** Grow stack 1 from left and stack 2 from right.
- **Complexity:** O(1) for operations.

### Day 50: [Array End Insert](file:///c:/GeeksforGeeks/Array/Day50.java)

- **Problem:** Insert value at the end.
- **Step-by-Step Logic:** `arr[size] = val`.
- **Complexity:** Time: $O(1)$, Space: $O(1)$.

---

_Happy Coding! 🎯_
