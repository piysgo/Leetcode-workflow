class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxVal = Arrays.stream(nums).max().getAsInt();
        int low = 1 , high = maxVal,smallest_divisor=0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int total= get(nums,mid,threshold);
            if(total<=threshold){
                smallest_divisor=mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return smallest_divisor;
        
    }
        public static int get(int[]nums,int mid,int thresh){
            int cnt= 0; int n = nums.length;
            for(int i=0;i<n;i++){
                cnt += (int)Math.ceil((double)nums[i]/mid);
                
            }
            return cnt;
        }
}