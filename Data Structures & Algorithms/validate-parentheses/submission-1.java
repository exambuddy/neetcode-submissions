class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> mappedBrackets = new HashMap<Character,Character>();
        mappedBrackets.put(')','(');
        mappedBrackets.put(']', '[');
        mappedBrackets.put('}', '{');

        Stack<Character>brackets = new Stack<>();
        for(char c:s.toCharArray()){
            if(mappedBrackets.containsKey(c)){
                if(!brackets.isEmpty() && brackets.peek() == mappedBrackets.get(c)){
                    brackets.pop();
                }else{
                    return false;
                }
            }else{
                brackets.add(c);
            }
        }
        return brackets.isEmpty();
    }
}
