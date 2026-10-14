class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Arrays.sort(intervals, (a, b) ->
            Integer.compare(a[0], b[0])
        );
        int n = queries.length;
        int[][] sortedQueries = new int[n][2];
        for (int i = 0; i < n; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, (a, b) ->
            Integer.compare(a[0], b[0])
        );
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );
        int[] ans = new int[n];
        int j = 0;
        for (int[] query : sortedQueries) {
            int q = query[0];
            int index = query[1];
            while (j < intervals.length &&
                   intervals[j][0] <= q) {
                int l = intervals[j][0];
                int r = intervals[j][1];
                pq.offer(new int[]{r - l + 1, r});
                j++;
            }
            while (!pq.isEmpty() && pq.peek()[1] < q) {
                pq.poll();
            }
            ans[index] = pq.isEmpty() ? -1 : pq.peek()[0];
        }
        return ans;
    }
}
