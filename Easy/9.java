class Solution {
    public boolean isPalindrome(int x) {
        // edge case for when number is negative it will always be false
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            int last = temp % 10;
            reverse *= 10;
            reverse += last;
            temp = temp / 10;
        }
        return reverse == x;
    }
}