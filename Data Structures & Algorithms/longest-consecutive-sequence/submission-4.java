class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums) {
            set.add(x);
        }
        int maxC = 0;
        for(int n: set) {
            System.out.println("n ="+n);
            int count=0;
            if(set.contains(n-1)) continue;
            System.out.println("starting seq at "+n);
            int next = n+1;
            count++;
            while(set.contains(next++)) {
                System.out.println("found next val at "+next);
                count++;
            }
            maxC = Math.max(maxC, count);
        }
        return maxC;
    }
}
