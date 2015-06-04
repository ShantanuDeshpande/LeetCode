public class Solution {
    public int titleToNumber(String s) {
        char[] arr = s.toCharArray();
        int val = 0;
        for (int i = 0; i < arr.length; ++i)
        {
        	val *= 26;
        	val += arr[i] - 64;
        }
        return val;
    }
}
