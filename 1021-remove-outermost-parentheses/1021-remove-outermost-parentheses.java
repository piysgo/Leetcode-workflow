class Solution {
    public String removeOuterParentheses(String s) {
        int cnt =0;
        int n =s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==')'){
                cnt--;
            }if(cnt!=0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i)=='('){
                cnt++;
            }
        }
        return ans.toString();
    }
}