public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
		int i = 0;
		int j = s.length()-1;
		while(i < j){
			char a = s.charAt(i);
			char b = s.charAt(j);
			while(!((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z')) && i < j){
				i++;
				a = s.charAt(i);
			}
			while(!((b >= '0' && b <= '9') || (b >= 'a' && b <= 'z')) && j > i){
				j--;
				b = s.charAt(j);
			}
			if (a == b){
				i++;
				j--;
			}
			else{
				return false;
			}
		}
		return true;
    }
}
