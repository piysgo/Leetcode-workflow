class Solution {
    public int search(int[] nums, int target) {
         int n = nums.length;
        int low = 0;
        int high = n-1;
        return find(nums, target,low,high);
        
    }

    public static int find(int[]nums, int target, int low,int high){
        if(low>high) return -1;

        int mid = (low+high)/2;
        if(nums[mid]==target) return mid;

        else if(nums[mid]<target) return find(nums,target,mid+1,high);

        return find(nums,target,low,high-1);
        

    }
}