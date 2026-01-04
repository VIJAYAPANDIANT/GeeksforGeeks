/*Min Chars to Add for Palindrome
Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.

Note: A palindrome string is a sequence of characters that reads the same forward and backward.

Examples:

Input: s = "abc"
Output: 2
Explanation: Add 'b' and 'c' at front of the above string to make it palindrome: "cbabc"
Input: s = "aacecaaaa"
Output: 2
Explanation: Add 2 a's at front of the above string to make it palindrome: "aaaacecaaaa" */
/*class Solution {
    public int minChar(String s) {
        // code here
        String rev =new StringBuilder(s).reverse().toString();
        String temp=s+"#"+rev;
        int[] lps=new int[temp.length()];
        int len=0;
        for(int i=1;i<temp.length();i++){
            while(len>0&&temp.charAt(i)!=temp.charAt(len)){
                len =lps[len-1];
            }
            if(temp.charAt(i)==temp.charAt(len)){
                len++;
            }
            lps[i]=len;
        }
       return s.length()-lps[temp.length()-1];
    }
} */