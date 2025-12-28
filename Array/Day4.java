/*Rotate Array
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :
Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array. */
// User function Template for Java

/*class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d=d%n;
        int gcd=gcd(n,d);
        for(int i=0;i<gcd;i++){
            int temp=arr[i];
            int j=i;
            while(true){
                int k=j+d;
                if(k>=n)
                k=k-n;
                if(k==i)
                break;
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }
    static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
}*/