class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        HashMap <Character, Character> hash1 = new HashMap<>();
        HashMap <Character, Character> hash2 = new HashMap<>();
        
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(hash1.containsKey(c1)){
                if(hash1.get(c1)!=c2){
                    return false;
                }
                }else{
                    hash1.put(c1, c2);
                }

            if(hash2.containsKey(c2)){
                if(hash2.get(c2) != c1){
                    return false;
                }
            }else{
                hash2.put(c2,c1);
            }
            }
            return true;
        }
        
        
    }
