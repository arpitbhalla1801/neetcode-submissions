class Solution {
    public boolean isPalindrome(String s) {
        int f = 0;
        int r = s.length()-1;
        while(f<r) {
            while(f<r && (!Character.isLetterOrDigit(s.charAt(f)))) f++;
            while(r>f && (!Character.isLetterOrDigit(s.charAt(r)))) r--;

            if(Character.toLowerCase(s.charAt(f)) != Character.toLowerCase(s.charAt(r))) return false;

            f++;r--;
        }

        return true;
    }
}
