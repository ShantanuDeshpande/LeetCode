public class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        int count = 0;
        for (int i = 0; i < nums.length; ++i){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],true);
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
