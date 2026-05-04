class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> charData = new HashMap<Character,Integer>();
        int l=0;
        int res = 0;
        for(int r = 0;r<s.length();r++){
            charData.put(
                s.charAt(r), charData.getOrDefault(s.charAt(r),0)+1
            );
            int max = Collections.max(charData.values());
            while((r-l+1)-max> k){
                charData.put(s.charAt(l),charData.get(s.charAt(l))-1);
                l+=1;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
