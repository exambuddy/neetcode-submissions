class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const mapper = new Map();
    
        for (let i = 0; i < nums.length; i++) {
            mapper.set(nums[i], (mapper.get(nums[i]) || 0) + 1);
        }
    
        const maxValue = Math.max(...mapper.values())
        const buckets = []
        for(let i= 0;i<=maxValue; i++){
            buckets[i]= []
        }
        // console.log(mapper);
        // console.log(buckets)
        for (const[count,freq] of mapper){
            buckets[freq].push(count);
        }
        const result = []
        for(let i=buckets.length-1; i> 0 && result.length <= k-1  ; i--){
            result.push(...buckets[i])
        }
        return result
    }
}
