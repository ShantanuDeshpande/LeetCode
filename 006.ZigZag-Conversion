public class Solution {
    public String convert(String s, int numRows) {
        char[] arr = s.toCharArray();
		int len = arr.length;
		char[] op = new char[len];
		int val = 0;
		if(numRows == 1){
			return s;
		}
		else{
			for (int i = 0; i < numRows; ++i){
				int j = i;
				if(i == 0 || i == numRows-1){
					while(j < len){
						op[val] = arr[j];
						val++;
						j += 2*numRows - 2;
					}
				}
				else{
					while(j < len){
						op[val] = arr[j];
						val++;
						j += 2*numRows - 2 - 2*i;
						if(j < len){
							op[val] = arr[j];
							val++;
						}
						j += 2*i;
					}
				}
			}
			String printS = new String(op);
			return printS;
		}
    }
}
