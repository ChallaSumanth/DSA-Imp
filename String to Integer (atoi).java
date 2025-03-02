class Solution {
    public int myAtoi(String s) {
        boolean isNeg = false;
        double no = 0;
        int idx = 0;
        while(idx < s.length() && s.charAt(idx) == ' ')
            idx++;
        if(idx < s.length() && s.charAt(idx) == '-')
        {
            idx++;
            isNeg = true;
        }
        else if(idx < s.length() && s.charAt(idx) == '+')
        {
            idx++;
        }
        while(idx < s.length() && Character.isDigit(s.charAt(idx)))
        {
            int ch = s.charAt(idx) - '0';
            no = (no * 10) + ch;
            idx++;
        }

        if(no == 0)
            return 0;
        return isNeg ? (int)-no : (int)no;
    }
}