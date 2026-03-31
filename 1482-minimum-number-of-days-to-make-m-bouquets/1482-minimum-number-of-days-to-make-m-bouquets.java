class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowers = (long)(m*k);
        if(totalFlowers>bloomDay.length) return -1;
        int maxVal = Arrays.stream(bloomDay).max().getAsInt();
        int minVal = Arrays.stream(bloomDay).min().getAsInt();
        int low = minVal, high = maxVal;
        int result = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(isPossible(bloomDay, mid,m,k)){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
        
    }
    public static boolean isPossible(int[] arr, int day, int m, int k){
        int bouquet =0;
        int cnt = 0;
        for(int i:arr){
            if(i<=day){
                cnt++;
                if(cnt==k){
                    bouquet++;
                    cnt =0;
                }
            }else{cnt =0;
            }
        }
        return bouquet >= m;
    }
}