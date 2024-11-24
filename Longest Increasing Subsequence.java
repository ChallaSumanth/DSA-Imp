//https://www.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1
class Solution {
    // Function to find length of longest increasing subsequence.
    static int longestSubsequence(int arr[]) {
        // code here
        int len = arr.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int max = 1;
        for(int i = 0; i < len; i++)
        {
            for(int prev = 0; prev < i; prev++)
            {
                if(arr[prev] < arr[i])
                dp[i] = Math.max(1 + dp[prev], dp[i]);
                
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}