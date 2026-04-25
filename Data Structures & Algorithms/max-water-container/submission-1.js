class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let n = heights.length
        let left = 0;
        let right = n-1;
        let maxVal =0
        while(left < right){
            let currentArea = (Math.min(heights[left], heights[right])) * (right-left);
            maxVal = Math.max(currentArea,maxVal)
            heights[left] > heights[right] ? right-- : left++ 
        }
        return maxVal
    }
}
