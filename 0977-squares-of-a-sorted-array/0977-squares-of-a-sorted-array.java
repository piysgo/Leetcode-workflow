class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int[] result = new int[n];
            
        for(int i=0;i<n;i++){
           nums[i] = nums[i] * nums[i];
        }
       int low = 0;
       int high = n-1;
       for(int i=n-1;i>=0;i--){
        if(nums[low]>nums[high]){
            result[i] = nums[low];
            low++;
        }else{
            result[i] = nums[high];
            high--;
        }
       }
    return result;
    }
}