public class Solution {
    public void rotate(int[] nums, int k) {
        if (k == 0){
            return;
        }
        int len = nums.length;
		k %=  len;
		int count = 0;
		int temp = nums[count];
		int dis = 0;
		for (int i = 0; i < len; ++i){
			int index = (count + k)%len;
			int val = nums[index];
			nums[index] = temp;
			temp = val;
			count = index;
			dis = (dis + k)%len;
			if (dis == 0){
				count = (count + 1)%len;
				temp = nums[count];
			}
		}
    }
}
