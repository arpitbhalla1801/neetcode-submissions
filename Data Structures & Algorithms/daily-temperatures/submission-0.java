class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n= t.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (t[j] > t[i]) {
                    a[i] = j - i;
                    break;
                }
        }
        }
        return a;
    }
}
 