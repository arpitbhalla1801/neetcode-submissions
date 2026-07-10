class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1arr = s1.toCharArray();
        Arrays.sort(s1arr);
        s1 = new String(s1arr);
        for(int i=0;i<s2.length();i++) {
            for(int j=i;j<s2.length();j++) {
                char[] x = s2.substring(i, j+1).toCharArray();
                Arrays.sort(x);
                String temp = new String(x);

                if(s1.equals(temp)) return true;
            }
        }
        return false;
    }
}
