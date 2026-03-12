class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
            
        for(int i=0;i<n;i++){
           nums[i] = nums[i] * nums[i];
        }
       int low = 0;
       int high = n-1;
       for(int i = low; i < high; i++) {
            for(int j = low; j < high - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                   nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        
    }
    return nums;
    }
}