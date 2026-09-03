class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);

        dfs(0, new ArrayList<>(), 0, nums, target);

        return res;
    }

    private void dfs(
        int i,
        List<Integer> cur,
        int total,
        int[] nums,
        int target
    ) {
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int j = i; j < nums.length; j++) {

            if (total + nums[j] > target) {
                break;
            }

            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }

            cur.add(nums[j]);

            dfs(j + 1, cur, total + nums[j], nums, target);

            cur.remove(cur.size() - 1);
        }
    }
}