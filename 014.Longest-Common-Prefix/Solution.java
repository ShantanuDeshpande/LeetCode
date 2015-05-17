public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String str = strs[0];
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < len; ++i){
            char c = str.charAt(i);
            for (int j = 1; j < strs.length; ++j){
                if(strs[j].length() < i +1){
                    flag = true;
                }
                if(flag){
                    break;
                }
                if(strs[j].charAt(i) != c){
                    flag = true;
                } 
                if(flag){
                    break;
                }
            }
            if(flag){
                break;
            }
            sb.append(c);
        }
        String op = sb.toString();
        return op;
    }
}
