class Solution {
    public long maximumScore(int[] nums) {
        long[] prefix = new long[nums.length];
        long[] suffix = new long[nums.length];
        long sum = 0;
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            suffix[i] = min;
        }
        long ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            long value = prefix[i] - suffix[i + 1];
            ans = Math.max(ans, value);
        }
        return ans;
    }
}
