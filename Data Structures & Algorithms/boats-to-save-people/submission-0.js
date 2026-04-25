class Solution {
    /**
     * @param {number[]} people
     * @param {number} limit
     * @return {number}
     */
    numRescueBoats(people, limit) {
        people.sort((a,b)=> a-b)
        let l =0;
        let r =people.length-1;
        let count = 0
        while(l <= r){

            if(people[l] + people[r] <= limit){
                l++
            }
            count += 1
            r--
            
        }
        return count
    }
}
