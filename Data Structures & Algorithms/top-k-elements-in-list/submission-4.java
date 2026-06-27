class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums) {
            if(map.get(x)!=null) {
                map.put(x, map.get(x)+1);
            } else {
                map.put(x, 1);
            }
        }
        List<Integer>[] arr = new List[nums.length+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            arr[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int in=0;
        for(int i=arr.length-1; i>0 && in<k; i--) {
            System.out.println(arr[i]);
            for(int n: arr[i]) {
                System.out.println(n);
                res[in++] = n;
                if(in==k) return res;
            }
        }
        return res;
    }
}
