class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int l=0;
        int r=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < s.length()) {
            if(map.containsKey(s.charAt(r))) {
                l=Math.max(l, map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r), r);
            r++;
            max=Math.max(max, r-l);
        }
        return max;
    }
}
