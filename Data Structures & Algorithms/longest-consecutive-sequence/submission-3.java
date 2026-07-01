class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums) {
            map.putIfAbsent(x, x);
        }
        int maxC=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int count=0;
            int x = entry.getKey();
            System.out.println("X="+x);
            if(map.get(x-1)==null) {
                System.out.println("starting seq at "+x);
                int n = x;
                count++;
                while(map.get(++n)!=null) {
                    System.out.println("Found next element "+n);
                    count++;
                }
            }
            maxC = Math.max(maxC, count);
        }
        return maxC;
    }
}
