class Solution {
    public String largestEven(String s) {
        if (s.charAt(s.length() - 1) =='2') {
            return s;
        }
        String ans = "";
        int idx = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                idx = i;
                break;
            }
        }
        if(idx != -1){
            ans = s.substring(0,idx+1);
        }
        return ans;
    }
}©leetcode