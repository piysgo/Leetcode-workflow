class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxVal = Arrays.stream(piles).max().getAsInt();
        int low = 1, high = maxVal;
        int ans =0;
        while(low<=high){
            int mid = low + (high-low)/2;
            long result = Totalhrs(piles, mid);
            if(result<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
        
    }
    public static long Totalhrs(int[] piles, int mid){
        long hrs=0;
        for(int i:piles){
hrs += (int)Math.ceil((double)(i)/mid);              }
        return hrs;
    }
}