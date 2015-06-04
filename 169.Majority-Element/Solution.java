public class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 0;
        for (int n: nums){
            if (n == val){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                val = n;
                count = 1;
            }
        }
        return val;
    }
}
