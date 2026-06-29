class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        l[0]=1;
        r[nums.length-1]=1;
        for(int i=1;i<nums.length;i++) { 
            // System.out.println(nums[i-1]);
            l[i]=nums[i-1]*l[i-1];
        }
        for(int j=nums.length-2;j>=0;j--) {
            // System.out.println(nums[j+1]);
            r[j]=r[j+1]*nums[j+1];
        }
        for(int x=0;x<nums.length;x++) {
            nums[x]=l[x]*r[x];
        }
        return nums;
    }
}  
