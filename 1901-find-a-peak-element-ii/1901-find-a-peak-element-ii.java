class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low =0, high =m-1;
        while(low<=high){
            int mid = (low + high)/2;
            int get = greaterEle(mat,mid);

            int left = mid-1>=0 ? mat[get][mid-1]: Integer.MIN_VALUE;
            int right = mid+1<m ? mat[get][mid+1]: Integer.MIN_VALUE;

            if((mat[get][mid]>left)&& (mat[get][mid]>right)){
                return new int[]{get,mid};
            }else if(left>mat[get][mid]){
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return new int[]{-1,-1};
        
    }
    public static int greaterEle(int[][]arr, int col){
        int max = Integer.MIN_VALUE, indx =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i][col]>max){
                max = arr[i][col];
                indx = i;
            }
        }
        return indx;

    }
}