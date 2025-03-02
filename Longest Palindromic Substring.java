class Solution {
        int lo = 0;
        int maxLen = 0;
    public String longestPalindrome(String s) {
        if(s.length() == 1)
            return s;
        for(int i = 0; i < s.length() - 1; i++)
        {
            checkPalindrome(i, i, s);
            checkPalindrome(i, i + 1, s);
        }

        return s.substring(lo, lo + maxLen);
    }

    private void checkPalindrome(int start, int end, String s)
    {
        while(start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end))
        {
            start--;
            end++;
        }
        if(maxLen < end - start - 1)
        {
            lo = start + 1;
            maxLen = end - start - 1;
        }
    }
}