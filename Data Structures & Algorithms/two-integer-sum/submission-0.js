class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const exist = new Map();
        for(let i=0;i<=nums.length-1;i++ ){
            const diff = target-nums[i];
            if(exist.has(diff)){
                return [exist.get(diff),i]
            }
            exist.set(nums[i],i)

        }
    }
}
