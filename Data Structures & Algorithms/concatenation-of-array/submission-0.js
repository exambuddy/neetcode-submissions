class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        const l = nums.length
        const twiceLengthArr = new Array(2*l);

        for(let i=0;i<nums.length;i++){
            twiceLengthArr[i] = nums[i];
            twiceLengthArr[i+l] =nums[i]
        }
        return twiceLengthArr
    }
}
