class Solution {
    public int splitArray(int[] nums, int k) {
        int min = Arrays.stream(nums).max().getAsInt();
        int max = Arrays.stream(nums).sum();
        while(min <= max){
            int mid = (min + max)/2;
            int split = CountArrays(nums, mid);
            if(split <= k){
                max = mid- 1;
            }
            else{
                min = mid +1;
            }
        }
        return min;
    }
    public static int CountArrays(int[] nums, int mid){
        int count = 1, sum = 0 , n = nums.length;
        for(int i=0;i<n;i++){
            if(sum + nums[i] <=mid){
                sum = sum + nums[i];
            }else{
                count++;
                sum = nums[i];
            }
        }
        return count;
    }
    
}