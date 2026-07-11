class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int max=0;
        for(char x: arr) {
            while(set.contains(arr[r])) {
                set.remove(arr[l]);
                l++;
            }
            set.add(arr[r]);
            r++;
            max=Math.max(max, r-l);
        }
        return max;
    }
}
