class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = Arrays.stream(weights).sum();

        int left =Arrays.stream(weights).max().getAsInt();
        int right = sum;
        int count = 1;
        int currentSum = 0;
        int output = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            for(int el:weights){
                currentSum +=el;

                if(currentSum > mid){
                    currentSum = el;
                    count +=1;
                }
            }
            if(count <= days){
                output = mid;
                right =mid-1;
            }else{
                left = mid+1;
            }
            count = 1;
            currentSum = 0;
        }
        return output;
    }
}