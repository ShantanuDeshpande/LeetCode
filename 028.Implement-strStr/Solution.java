public class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        int blen = haystack.length();
        for(int i = 0; i < blen - len + 1; ++i){
            String temp = haystack.substring(i,i+len);
            if(temp.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
