class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList <Integer> arr1 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }

        for(int i=0;i<n/2;i++){
            nums[2*i] = arr1.get(i);
            nums[2*i+1] = arr2.get(i);
        }
        return nums;

        
    }
}