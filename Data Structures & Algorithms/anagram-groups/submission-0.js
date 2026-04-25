class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let map = new Map();

        for(let i=0; i<=strs.length-1 ; i++ ){
            let sorted = strs[i].split('').sort().join('')
            if(!map.has(sorted)){
                map.set(sorted,[strs[i]])
            }else{
                let sortedVal = map.get(sorted)
                sortedVal.push(strs[i])
            }
        }
        return [...map.values()]

    }
}
