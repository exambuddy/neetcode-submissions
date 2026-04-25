class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        var result = s.replace(/[^a-zA-Z0-9]/g, "").toLowerCase().trim()
        let left = 0;
        let right = result.length-1;
        while(left<right){
            if(result[left] !== result[right]){
                return false
            }
            left++;
            right--
        }
        return true
    }
}
