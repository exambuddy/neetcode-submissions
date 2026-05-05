class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left =0;
       int counter = 0;
       int minLen = Integer.MAX_VALUE;

       for(int right = 0;right<nums.length;right++){
        counter += nums[right];
        while(counter >= target){
            counter = counter -nums[left];
            minLen = Math.min(right-left+1,minLen);
            left++;
        }
                
       }
       return (minLen == Integer.MAX_VALUE) ? 0 : minLen; 
    }
}