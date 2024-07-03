class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4)
            return 0;

        Arrays.sort(nums);
        int n =nums.length;
        int res = Integer.MAX_VALUE;
        res = Math.min(res,nums[n-4]-nums[0]);
        res = Math.min(res,nums[n-3]-nums[1]);
        res = Math.min(res,nums[n-2]-nums[2]);
        res = Math.min(res,nums[n-1]-nums[3]);


        return res;
        
    }
}