class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        const mapper = new Map();
        let maxVal = 0;
        let maxDigit = 0
        for(let i =0;i<nums.length;i++){
            let numsVal = mapper.get(nums[i])
            mapper.set(nums[i],numsVal ? numsVal+1 : 1);
            numsVal = mapper.get(nums[i])
            if(numsVal > maxVal){
                maxVal = numsVal;
                maxDigit = nums[i]
            }
            
        }
        return maxDigit
    }
}
