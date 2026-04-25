class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    majorityElement(nums) {
        const maxVal = Math.floor(nums.length / 3)
        const mapper = new Map();
        for(let i=0;i<nums.length;i++){
            const getVal = mapper.get(nums[i]) || 0
            mapper.set(nums[i],getVal+1)
        }
        const returnArr = []
        for(let [num,freq] of mapper){
            if(freq > maxVal){
                returnArr.push(num)
            }
        }
        return returnArr
    }
}
