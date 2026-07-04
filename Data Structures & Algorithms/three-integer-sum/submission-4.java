class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int f = i+1;
            int r = nums.length-1;
            while(f < r) {
                if(nums[i]+nums[f]+nums[r] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[f]);
                    temp.add(nums[r]);
                    f++;r--;
                    list.add(temp);
                    while(f<r && nums[f]==nums[f-1]) f++;
                    while(f<r && nums[r]==nums[r+1]) r--;
                }
                if(nums[i]+nums[f]+nums[r] > 0) r--;
                else if(nums[i]+nums[f]+nums[r] < 0) f++;
            }
        }
        return list;
    }
}
