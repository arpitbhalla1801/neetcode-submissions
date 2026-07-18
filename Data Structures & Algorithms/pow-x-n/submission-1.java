class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long n1=0;
        boolean neg = false;
        n1=Math.abs((long)n);
        if(n<0) {
            neg = true;
        }
        while(n1!=0) {
            if((n1&1)==1) res = res * x;
            x=x*x;
            n1 >>= 1;
        }
        return neg ? 1/res:res;
    }
}
