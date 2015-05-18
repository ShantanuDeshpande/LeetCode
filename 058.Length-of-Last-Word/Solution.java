public class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < len; ++i){
        	if(s.charAt(i) == ' '){
        		flag = true;
        	}
        	else{
        		if(flag){
        			count = 0;
        			flag = false;
        		}
        		count++;
        	}
        }
        return count;
    }
}
