public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < s.length(); ++i){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!map.containsKey(c1)){
                if(hs.contains(c2)){
                    return false;
                }
                map.put(c1,c2);
                hs.add(c2);
            }
            else{
                if(map.get(c1) != c2){
                    return false;
                }
            }
        }
        return true;
    }
}
