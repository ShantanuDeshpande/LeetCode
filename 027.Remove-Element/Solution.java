public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        int count = 0;
        boolean flag = true;
        for(int k = 0; k < len; ++k){
            if(nums[k] != val){
                flag = false;
            }
        }
        if(flag){
            nums = new int[0];
            return 0;
        }
        while(i < len){
            if(nums[i] == val){
                int j = 1;
                while(nums[len-j] == val && (len - j) > i){
                    j++;
                }
                int temp = nums[len-j];
                nums[len-j] = nums[i];
                nums[i] = temp;
                if((len - j) != i){
                    count++;
                }
            }
            else{
                count++;
            }
            i++;
        }
        return count;
    }
}
