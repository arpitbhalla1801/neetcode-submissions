class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String x: strs) {
            char[] temp = x.toCharArray();
            Arrays.sort(temp);
            String temp2 = new String(temp);
            if(map.get(temp2)==null) {
                List<String> l2 = new ArrayList<>();
                l2.add(x);
                map.put(temp2, l2);
            } else {
                List<String> l1 = map.get(temp2);
                l1.add(x);
                map.put(temp2, l1);
            }
        }
        return new ArrayList<>(map.values());
    }
}
