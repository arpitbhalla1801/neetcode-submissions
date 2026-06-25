class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++) {
            if(map.get(nums[i])!=null) {
                res[0] = map.get(nums[i]);
                res[1] = i;
            } else {
                map.putIfAbsent(target-nums[i], i);
            }
        }
        return res;
    }
}
