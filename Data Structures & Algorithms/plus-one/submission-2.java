class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==0) return digits;
        int n=digits.length-1;
        while(n>=0 && digits[n]==9) {
            digits[n]=0;
            n--;
        }
        if(n<0) {
            int[] newd = new int[digits.length+1];
            System.arraycopy(digits, 0, newd, 1, digits.length);
            newd[0]=1;
            return newd;
        } else {
            digits[n]+=1;
            return digits;
        }
    }
}
