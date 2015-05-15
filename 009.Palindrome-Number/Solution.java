public class Solution {
    public boolean isPalindrome(int x) {
        int y = 1;
		if(x < 0){
			return false;
		}
		while(x/y >= 10){
			y *= 10;
		}
		while(x != 0){
			int l = x/y;
			int r = x%10;
			if (l != r){
				return false;
			}
			x = (x%y)/10;
			y /= 100;
		}
		return true;
    }
}
