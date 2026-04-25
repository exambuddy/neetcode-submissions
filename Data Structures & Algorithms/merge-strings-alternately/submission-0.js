class Solution {
    /**
     * @param {string} word1
     * @param {string} word2
     * @return {string}
     */
    mergeAlternately(word1, word2) {
        let subStr = ""
        for(let i=0;i<Math.max(word1.length,word2.length);i++){
            if(word1[i]){
                subStr += word1[i];
            }
            if(word2[i]){
                subStr += word2[i];
            }
        }
        return subStr
    }
}
