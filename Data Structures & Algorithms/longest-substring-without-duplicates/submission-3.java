class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> words =  new HashSet<>();
        int left = 0;
        int maxLength = 0;
       
        
        for(int right = 0; right<s.length();right++){
            while (words.contains(s.charAt(right))) {
                words.remove(s.charAt(left));
                left++;
            }
            words.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength ;
    }
}
