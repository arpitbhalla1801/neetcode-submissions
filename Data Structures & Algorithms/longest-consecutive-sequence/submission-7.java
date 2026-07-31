class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums) {
            set.add(x);
        }
        int maxC = 0;
        for(int n: set) {
            int count=0;
            if(set.contains(n-1)) continue;
            int next = n+1;
            count++;
            while(set.contains(next++)) {
                count++;
            }
            maxC = Math.max(maxC, count);
        }
        return maxC;
    }
}
