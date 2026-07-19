class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length-k+1];
        int i=0;
        int j=k-1;
        while(j<nums.length) {
            int max=Integer.MIN_VALUE;
            for(int a=i;a<j+1;a++) {
                // System.out.println("for i="+i+"nums[a]="+nums[a]);
                if(nums[a]>max) max=nums[a];
            }
            // System.out.println("value max"+max);
            arr[i]=max;
            i++;
            j++;
        }
        return arr;
    }
}
