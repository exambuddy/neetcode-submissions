class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations) {
        let stack=[]
        let res = 0;
        for(let i=0;i<operations.length;i++){
            if(operations[i] === 'C'){
                let val = stack.pop()
                res= res-val
            }else if(operations[i] === 'D'){
                let val =  stack[stack.length-1] * 2
                stack.push(val);
                res += val
            }else if(operations[i] === '+'){
                let val = stack[stack.length-1] + stack[stack.length-2];
                stack.push(val)
                res += val
            }else{
                stack.push(parseInt(operations[i]))
                res += stack[stack.length - 1];
            }
        }
        return res
    }
}
