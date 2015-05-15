public class Solution {
    public int myAtoi(String str) {
        char[] arr = str.toCharArray();
		int len = arr.length;
		char[] op = new char[len];
		int j = 0;
		int i = 0;
		boolean flag = false;
		if(len == 0){
		    return 0;
		}
		while(arr[i] == ' '){
			i++;
		}
		if((arr[i] > '9' || arr[i] < '0') && arr[i] != '-' && arr[i] != '+'){
			return 0;
		}
		else{
			if (arr[i] == '-' && arr[i+1] != '-' && arr[i+1] != '+'){
				flag = true;
				i++;
				while(i < len && (arr[i] <= '9' && arr[i] >= '0')){
					op[j] = arr[i];
					j++;
					i++;
				}
			}
			else if((arr[i]<='9' && arr[i]>='0')||(arr[i]=='+' && arr[i+1]<='9' && arr[i+1]>='0')){
			    if(arr[i] == '+'){
			        i++;
			    }
				while(i < len && (arr[i] <= '9' && arr[i] >= '0')){
					op[j] = arr[i];
					j++;
					i++;
				}
			}
			char[] numop = Arrays.copyOfRange(op,0,j);
			String val = new String(numop);
			int num = 0;
			if (numop.length > 0){
				if (flag){
					num += numop[0] - 48;
					num *= -1;
					if (numop.length < 11){
					    for(int k = 1; k < numop.length; ++k){
						    if(k != 10 || numop[k] >= '9'){
						        num *= 10;
							    num -= numop[k] - 48;
						    }
					    }
					}
					if (num == 2147483647 || numop.length > 10){
						num = -2147483648;
					}
				}
				else{
				    if (numop.length < 11){
					    for(int k = 0; k < numop.length; ++k){
						    if(k != 10 || numop[k] >= '8'){
						        num *= 10;
							    num += numop[k] - 48;
						    }
					    }
				    }
					if (num == -2147483648 || numop.length > 10){
					    num = 2147483647;
					}
				}
			}
			return num;
		}
    }
}
