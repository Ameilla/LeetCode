class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxsum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];
            maxsum = Math.max(sum,maxsum);
            if(sum<0) sum = 0;
        }
        return maxsum;
    }
}