class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left =0;
       int counter = 0;
       int minLen = Integer.MAX_VALUE;

       for(int right = 0;right<nums.length;right++){
        counter += nums[right];
        while(counter >= target){
            minLen = Math.min(right-left+1,minLen);
            counter = counter -nums[left];
            left++;
        }
                
       }
       return (minLen == Integer.MAX_VALUE) ? 0 : minLen; 
    }
}