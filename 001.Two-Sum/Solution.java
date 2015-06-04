public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; ++i){
            if (!map.containsKey(nums[i])){
                map.put(target-nums[i],i+1);
            }
            else{
                int val = map.get(nums[i]);
                arr[0] = val;
                arr[1] = i+1;
                break;
            }
        }
        return arr;
    }
}
