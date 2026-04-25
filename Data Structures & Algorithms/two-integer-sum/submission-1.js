class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const mappedData = new Map();

        for(let i=0; i<nums.length;i++){
            let findVal = target - nums[i]
            if(mappedData.has(findVal)){
                return [i,mappedData.get(findVal)]
            }
            mappedData.set(nums[i],i)
        }
    }
}
