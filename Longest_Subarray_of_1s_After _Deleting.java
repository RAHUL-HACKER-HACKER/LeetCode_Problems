class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0, cur = 0, max = 0;

        for(int num : nums) {
            if(num == 1) cur++;
            else {
                max = (max > prev+cur) ? max : prev+cur;
                prev = cur;
                cur = 0;
            }
        }
        if(nums[nums.length-1] == 1) {
            max = (max > prev+cur) ? max : prev+cur;
        }
        if(max == nums.length) max--; //cuz we MUST delete one element even if all are elements are 1

        return max;
    }
}