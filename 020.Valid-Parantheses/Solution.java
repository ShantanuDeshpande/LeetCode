public class Solution {
    public boolean isValid(String s) {
        if (s == "" || s == "()" || s == "{}" || s == "[]"){
			return true;
		}
		int i = 0;
		boolean sol = true;
		while(i < s.length()){
			char c = s.charAt(i);
			if(c == ')' || c == '}' || c == ']'){
				return false;
			}
			else if(c == '('){
				int j = i;
				boolean flag = false;
				int count = 0;
				while(j < s.length() - 1 && !flag){
					j++;
					if(s.charAt(j) == ')' && count == 0){
						flag = true;
					}
					else if (s.charAt(j) == '('){
						count++;
					}
					else if (s.charAt(j) == ')'){
						count--;
					}
				}
				flag = flag && isValid(s.substring(i+1,j));
				if(!flag){
					return false;
				}
				i = j + 1;
			}
			else if(c == '{'){
				int j = i;
				boolean flag = false;
				int count = 0;
				while(j < s.length() - 1 && !flag){
					j++;
					if(s.charAt(j) == '}' && count == 0){
						flag = true;
					}
					else if (s.charAt(j) == '{'){
						count++;
					}
					else if (s.charAt(j) == '}'){
						count--;
					}
				}
				flag = flag && isValid(s.substring(i+1,j));
				if(!flag){
					return false;
				}
				i = j + 1;
			}
			else if(c == '['){
				int j = i;
				boolean flag = false;
				int count = 0;
				while(j < s.length() - 1 && !flag){
					j++;
					if(s.charAt(j) == ']' && count == 0){
						flag = true;
					}
					else if (s.charAt(j) == '['){
						count++;
					}
					else if (s.charAt(j) == ']'){
						count--;
					}
				}
				flag = flag && isValid(s.substring(i+1,j));
				if(!flag){
					return false;
				}
				i = j + 1;
			}
		}
		return true;
    }
}
