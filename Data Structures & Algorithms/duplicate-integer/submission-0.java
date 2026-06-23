class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean res = false;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]) res=true;
        }
        return res;
    }
}