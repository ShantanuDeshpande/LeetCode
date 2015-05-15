public class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		char[] arr = s.toCharArray();
		int len = arr.length;
		int num = 0;
		for (int i = 0; i < len; ++i){
			if(i != len-1){
				char cur = arr[i];
				char nex = arr[i+1];
				if (map.get(cur) >= map.get(nex)){
					num += map.get(cur);
				}
				else{
					num -= map.get(cur);
				}
			}
			else{
				char cur = arr[i];
				num += map.get(cur);
			}
		}
		return num;
    }
}
