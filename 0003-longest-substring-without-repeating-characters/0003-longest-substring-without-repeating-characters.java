class Solution {
    public int lengthOfLongestSubstring(String s) {
     /*  int n = s.length();
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
            return max;*/

             HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;


    }
}