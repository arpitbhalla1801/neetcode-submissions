class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        boolean inserted = false;
        for (int[] interval : intervals) {
            if (inserted || interval[1] < newInterval[0]) {
                res.add(interval);
            }

            else if (interval[0] > newInterval[1]) {
                res.add(newInterval);
                res.add(interval);
                inserted = true;
            }

            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        if (!inserted) {
            res.add(newInterval);
        }

        return res.toArray(new int[res.size()][]);
    }
}