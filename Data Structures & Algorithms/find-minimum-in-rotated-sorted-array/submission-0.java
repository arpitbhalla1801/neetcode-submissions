class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l < h) {
            int mid=l+(h-l)/2;
            if(nums[h] > nums[mid]) h=mid;
            else l=mid+1;
        }
        return nums[l];
    }
}
