class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
        int max =0;

        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            int cnt = 0;
            for(int j=i;j<n;j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    cnt++;
                    max = Math.max(max, cnt);
                }else{
                    break;
                }
            }

        }
            return max;


    }
}