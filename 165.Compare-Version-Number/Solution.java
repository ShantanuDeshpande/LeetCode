public class Solution {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
		int len2 = version2.length();
		int i = 0;
		int j = 0;
		int num1 = 0;
		int num2 = 0;
		StringBuilder sb = new StringBuilder();
		while(i < len1 || j < len2){
			while(i < len1 && version1.charAt(i) != '.'){
				sb.append(version1.charAt(i));
				i++;
			}
			String temp = sb.toString();
			if(!temp.equals("")){
				num1 = Integer.parseInt(temp);
			}
			sb.setLength(0);
			while(j < len2 && version2.charAt(j) != '.'){
				sb.append(version2.charAt(j++));
			}
			temp = sb.toString();
			if(!temp.equals("")){
				num2 = Integer.parseInt(temp);
			}
			if (num1 > num2){
				return 1;
			}
			else if (num2 > num1){
				return -1;
			}
			i++;
			j++;
			sb.setLength(0);
			num1 = 0;
			num2 = 0;
		}
		return 0;
    }
}
