class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n =matrix.length;
        for(int i=0;i<n;i++){
            int idx = lowerbound(matrix[i],target);
            if(idx < matrix[i].length && matrix[i][idx]==target){
                return true;
            }
        }
        return false;
    }
    public static int lowerbound(int[] arr, int target){
        int n =arr.length;
        int ans =n;
        int low =0, high = n-1;
        while(low <=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low =mid+1;
            }
        }
        return ans;
    }
}