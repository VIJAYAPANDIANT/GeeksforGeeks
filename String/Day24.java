/* CamelCase Pattern Matching
Given a dictionary of words arr[] where each word follows CamelCase notation, print all words in the dictionary that match with a given pattern pat consisting of uppercase characters only.

CamelCase is the practice of writing compound words or phrases such that each word or abbreviation begins with a capital letter. Common examples include PowerPoint and Wikipedia, GeeksForGeeks, CodeBlocks, etc.

Example: "GeeksForGeeks" matches the pattern "GFG", because if we combine all the capital letters in "GeeksForGeeks" they become "GFG". Also note "GeeksForGeeks" matches with the pattern "GFG" and also "GF", but does not match with "FG".

Note: The driver code will sort your answer before checking and return the answer in any order.

Examples:

Input: arr[] = ["WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"], pat = "WTG"
Output: ["WelcomeToGeeksForGeeks"]
Explanation: Since only "WelcomeToGeeksForGeeks" matches the pattern, it is the only answer.
Input: arr[] = ["Hi", "Hello", "HelloWorld", "HiTech", "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab"], pat = "HA"
Output: []
Explanation: None of the words matches the given pattern.*/
/*public class Day24 {
    public static void main(String[] args) {
        String input = "ThisIsAnExampleOfCamelCasePatternMatching";
        String pattern = "TIACPM";

        boolean isMatch = isCamelCaseMatch(input, pattern);
        System.out.println("Does the input match the pattern? " + isMatch);
    }

    public static boolean isCamelCaseMatch(String input, String pattern) {
        int pIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (pIndex < pattern.length() && ch == pattern.charAt(pIndex)) {
                    pIndex++;
                } else if (pIndex >= pattern.length() || ch != pattern.charAt(pIndex)) {
                    return false;
                }
            }
        }
        return pIndex == pattern.length();
    }
}*/
/*import java.util.*;

class Solution {
    public static List<String> camelCaseMatch(String[] arr, String pat) {
        List<String> result = new ArrayList<>();

        for (String word : arr) {
            StringBuilder capitals = new StringBuilder();

            // Extract uppercase letters
            for (char ch : word.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    capitals.append(ch);
                }
            }

            // Check if pattern matches prefix
            if (capitals.toString().startsWith(pat)) {
                result.add(word);
            }
        }
        return result;
    }
}
 */
/*⏱️ Complexity Analysis

Time Complexity: O(N × L)

N = number of words

L = maximum length of a word

Space Complexity: O(L)

For storing uppercase characters of one word */
