class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack = new Stack<>();
        for(int astd:asteroids){
            while(!stack.isEmpty() && astd < 0 && stack.peek()>0){
                int diff = stack.peek()+astd;
                if(diff <0){
                    stack.pop();
                }else if(diff >0){
                    astd=0;
                }else{
                    astd=0;
                    stack.pop();
                }
            }
            if(astd != 0){
                stack.push(astd);
            }
        }
        return stack.stream().mapToInt(x ->x).toArray();
    }
}