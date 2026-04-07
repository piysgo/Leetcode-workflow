class Solution {
    public int maxDepth(String s) {
        int o=0;
        int max=0;;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') o++;
            max=Math.max(max,o);
            if(s.charAt(i)==')') o--;
           
        }
      return max;
    }
}