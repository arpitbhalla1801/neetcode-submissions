class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            int f = i+1;
            int r = nums.length-1;
            while(f < r) {
                if(nums[i]+nums[f]+nums[r] > 0) r--;
                else if(nums[i]+nums[f]+nums[r] < 0) f++;
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[f]);
                    temp.add(nums[r]);
                    f++;r--;
                    if(!list.contains(temp)) list.add(temp);
                }
            }
        }
        return list;
    }
}
