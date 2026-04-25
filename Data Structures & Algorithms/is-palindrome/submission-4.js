class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        let data = s.replace(/[^a-zA-Z0-9]/g, "").toLowerCase().trim()
        let l = 0;
        let r = data.length-1
        while(l < r){
            if(data[l] !== data[r]){
                return false
            }
            l++;
            r--;
        }
        return true
    }
}
