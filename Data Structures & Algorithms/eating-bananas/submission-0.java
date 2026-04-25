class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right  = Arrays.stream(piles).max().getAsInt();
        int res = right;
        while(left <= right){
            int mid = left+ (right-left)/2;
            int count = 0;
            for(int el:piles){
                count = (int) Math.ceil((double)el/mid) +count;
            }
            if(count <= h){
                res= mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }

}
