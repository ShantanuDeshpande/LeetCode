public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(n);
        int x = 0;
        while(true){
        	while (n > 0){
        		x += (n%10)*(n%10);
        		n /= 10;
        	}
        	if (x == 1 || hs.contains(x)){
        		break;
        	}
        	n = x;
        	hs.add(n);
        	x = 0;
        }
        if (x == 1){
        	return true;
        }
        else{
        	return false;
        }
    }
}
