class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        const setData = new Set()
        for(let i=0;i<nums.length;i++){
            setData.add(nums[i])
        }
        let maxData = 0
        for(let el of setData){
            if(!setData.has(el-1)){
                let longest = 1;
                while(setData.has(el+longest)){
                    longest+=1
                }
                maxData = Math.max(longest,maxData)
            }
        }
        return maxData
    }
}
