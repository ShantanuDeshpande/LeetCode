public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
		while(n > 0){
			char temp = (char)((n-1)%26 + 65);
			sb.append(temp);
			n = (n-1)/26;
		}
		return sb.reverse().toString();
    }
}
