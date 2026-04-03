class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxVal = Arrays.stream(weights).max().getAsInt();
        int sum = Arrays.stream(weights).sum();
        int low =maxVal , high = sum , ans = 0;
        while(low<=high){
            int mid = low +(high - low)/2;
            int totaldays = totalDays(weights,mid,days);
            if(totaldays<=days){
                ans= mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int totalDays(int[] weights,int mid,int days){
        int n =weights.length , day =1,currentLoad=0;
        for(int i=0;i<n;i++){
            if (currentLoad + weights[i] <= mid) {
            currentLoad += weights[i];
        } else {
            day++;
            currentLoad = weights[i];
        }
        }
        return day;
    }
}