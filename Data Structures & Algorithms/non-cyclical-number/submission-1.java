class Solution {
    public boolean isHappy(int n) {
        long sum=0;
        Set<Long> set = new HashSet<>();
        while(n!=0) {
            sum+=(int)Math.pow(n%10,2);
            n/=10;
        }
        // System.out.println("s="+sum);
        if(sum==1) return true;
        set.add(sum);
        if(sum==0) return false;
        while(true) {
            System.out.println("new sum="+sum);
            long tempsum=0;
            while(sum!=0) {
                tempsum+=(int)Math.pow(sum%10,2);
                sum/=10;
            }
            // System.out.println("t="+tempsum);
            if(tempsum==1) return true;
            if(!set.add(tempsum) || tempsum==0) return false;
            sum=tempsum;
        }
    }
}
