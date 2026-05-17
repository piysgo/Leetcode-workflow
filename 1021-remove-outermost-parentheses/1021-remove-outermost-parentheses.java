class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length(), cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                cnt++;
                if (cnt == 1) {
                    continue;
                }
                sb.append('(');

            } else {
                cnt--;
                if (cnt == 0)
                    continue;
                sb.append(")");
            }
        }
        return sb.toString();

    }
}