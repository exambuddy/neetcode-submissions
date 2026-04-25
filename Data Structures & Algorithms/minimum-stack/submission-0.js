class MinStack {
    constructor() {}
    stack = []
    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
        this.stack.push(val)
    }

    /**
     * @return {void}
     */
    pop() {
        this.stack.pop()
    }

    /**
     * @return {number}
     */
    top() {
        return this.stack[this.stack.length-1]
    }

    /**
     * @return {number}
     */
    getMin() {
        let min = Infinity;
        for(let el of this.stack){
            min = Math.min(min,el)
        }
        return min 
    }
}
