class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if (i==j) continue;
                max=Math.max(max, Math.abs(i-j)*Math.min(nums[i], nums[j]));
            }
        }
        return max;
    }
}
