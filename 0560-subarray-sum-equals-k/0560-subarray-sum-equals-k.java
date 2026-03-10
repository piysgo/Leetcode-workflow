class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
         HashMap<Integer, Integer> sumset = new HashMap<>();
         int prefixsum = 0;
         int cnt = 0;

         sumset.put(0,1);
         for(int i=0;i<n;i++){
            prefixsum = prefixsum+ nums[i];
            int value = prefixsum -k;
            if(sumset.containsKey(value)){
                cnt += sumset.get(value);

            }
            sumset.put(prefixsum, sumset.getOrDefault(prefixsum, 0)+1);
         }
         return cnt;
        
    }
}