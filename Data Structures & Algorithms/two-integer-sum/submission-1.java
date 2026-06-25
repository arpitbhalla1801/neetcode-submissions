class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.get(nums[i])!=null) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.putIfAbsent(target-nums[i], i);
            }
        }
        return new int[]{-1};
    }
}
