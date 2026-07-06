class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums) {
            set.add(x);
            xor ^= x;
        }

        for(int i=0;i<nums.length+1;i++) {
            xor ^= i;
        }

        return xor;
    }
}
