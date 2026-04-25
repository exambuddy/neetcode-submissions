class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> storedVal = new Stack<>();
//        System.out.println(("1"+"2"));
        for(String op:operations){
            if(op.equals("+")){
                int top = storedVal.pop();
                int lastEl = storedVal.peek();
                int sum = top+lastEl;
                storedVal.push(top);
                storedVal.push(sum);
            }else if(op.equals("D")){
                int lastEl = storedVal.peek();
                int doubleVal = 2 * lastEl;
                storedVal.push(doubleVal);
            }else if(op.equals("C")){
                storedVal.pop();
            }else {
                storedVal.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int val:storedVal){
            sum += val;
        }
        return sum;
    }
}