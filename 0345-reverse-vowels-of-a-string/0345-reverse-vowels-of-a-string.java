class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        int right = n - 1;

        for(int i = 0; i < n; i++){
            if(isVowel(sb.charAt(i))){
                
                while(right > i && !isVowel(sb.charAt(right))){
                    right--;
                }
                if(right <= i) break;
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(right));
                sb.setCharAt(right, temp);

                right--; 
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}