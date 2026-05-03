class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        int left = 0;

        for (int r= 0;r < nums.length;r++){
            if(r-left > k){
                set.remove(nums[left]);
                left++;
            }

            if(set.contains(nums[r])){
                return true;
            }

            set.add(nums[r]);

        }
        return false;
    }
}