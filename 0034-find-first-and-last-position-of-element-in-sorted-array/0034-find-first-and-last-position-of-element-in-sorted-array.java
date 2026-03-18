class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res1 = first(nums, target);
        int res2 = last(nums, target);
        if(res1==-1 || res2 ==-1) return new int[] {-1,-1};
        else return new int[] {res1, res2};
        
    }

    public static int first(int[] nums, int target){
        int n = nums.length;
        int res = -1;
        int low =0, high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                res = mid;
                high = mid-1;
            }else if(nums[mid]< target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
    public static int last(int[] nums, int target){
        int n = nums.length;
        int res = -1;
        int low =0, high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                res = mid;
                low = mid+1;
            }else if(nums[mid]< target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
}