public class Solution {
    public String countAndSay(int n) {
        if (n <= 0){
			return null;
		}
		String op = "1";
		for (int i = 1; i < n; ++i){
			StringBuilder sb = new StringBuilder();
			int len = op.length();
			int j = 0;
			while(j < len){
				char c = op.charAt(j);
				int val = 0;
				do{
					j++;
					val++;
				}while(j < len && op.charAt(j) == c);
				sb.append(Integer.toString(val));
				sb.append(c);
			}
			op = sb.toString();
		}
        return op;
    }
}
