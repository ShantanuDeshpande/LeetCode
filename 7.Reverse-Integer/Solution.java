public class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
		char[] arr = str.toCharArray();
		char[] op = new char[arr.length];
		if (x >= 0){
			for(int i = 0; i < arr.length; ++i){
				op[i] = arr[arr.length-1-i];
			}
		}
		else{
			op[0] = '-';
			for(int i = 0; i < arr.length-1; ++i){
				op[i+1] = arr[arr.length-1-i];
			}
		}
		str = new String(op);
		int num = 0;
		if (Long.parseLong(str) < 2147483648L && Long.parseLong(str) > -2147483649L){
			num = Integer.parseInt(str);
		}
		return num;
    }
}
