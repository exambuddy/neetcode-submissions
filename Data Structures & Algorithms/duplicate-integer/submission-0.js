class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const seenVal = new Set();
        for(let i=0; i<=nums.length-1 ;i++){
            if(seenVal.has(nums[i])){
                return true
            }
            seenVal.add(nums[i])
        }
        return false
    }
}
