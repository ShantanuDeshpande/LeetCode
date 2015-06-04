public class Solution {
    public int countPrimes(int n) {
        if(n <= 1){
            return 0;
        }
        boolean[] arr = new boolean[n];
		arr[0] = true;
		arr[1] = true;
		for(int i = 0; i < arr.length; ++i){
			if (!arr[i]){
				for (int j = 2; j*i <= n-1; ++j){
					arr[j*i] = true;
				}
			}
		}
		int val = 0;
		for (int i = 0; i < arr.length; ++i){
			if (!arr[i]){
				val++;
			}
		}
		return val;
    }
}
