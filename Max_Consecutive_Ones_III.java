class Solution {
    public int longestOnes(int[] nums, int k) {
        int answer = 0;

        int i = 0;
        int j = 0;
        int zeroes = 0;
        while(j < nums.length){
            if(nums[j] == 0){
                zeroes++;
            }
            
            while(zeroes > k){
                if(nums[i] == 0){
                    zeroes--;
                }
                i++;
            }
            
            answer = Math.max(j-i+1, answer);
            j++;
        }
        return answer;
    }
}