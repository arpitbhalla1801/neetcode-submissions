class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lastNum=Integer.MIN_VALUE;
        int count=0;
        int maxC=Integer.MIN_VALUE;
        for(int x: nums) {
            
            if(x==lastNum) continue;
            if(x==(lastNum+1)) {
                count++;
            } else {
                count=0;
            }
            System.out.println("L - "+lastNum);
            System.out.println("C - "+x);
            System.out.println(count);
            lastNum=x;
            maxC = Math.max(count, maxC);
        }
        return (maxC == Integer.MIN_VALUE) ? 0 : maxC+1;
    }
}
