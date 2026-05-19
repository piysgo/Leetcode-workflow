class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        List<String> ls = Arrays.asList(word);
        Collections.reverse(ls);
        return String.join(" ",ls);


    }
}