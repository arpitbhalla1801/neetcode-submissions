class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums) {
            if(map.get(x)==null) {
                map.put(x, 1);
            } else {
                map.put(x, map.get(x)+1);
            }

        }
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map2 = map.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())  
            .limit(k)                  
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new                
        ));
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            list.add(entry.getKey());
        }
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
