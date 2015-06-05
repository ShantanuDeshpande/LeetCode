public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int curVal = 0;
        int maxVal = 0;
        int start = 0;
        for (int i = 0; i < s.length(); ++i){
            if (!map.containsKey(s.charAt(i))){
                curVal++;
                map.put(s.charAt(i),i);
            }
            else{
                if(map.get(s.charAt(i)) < start){
                    curVal++;
                    map.put(s.charAt(i),i);
                }
                else{
                    start = map.get(s.charAt(i)) + 1;
                    map.put(s.charAt(i),i);
                    if (curVal > maxVal){
                        maxVal = curVal;
                    }
                    curVal = i - start + 1;
                }
            }
        }
        return Math.max(maxVal,curVal);
    }
}
