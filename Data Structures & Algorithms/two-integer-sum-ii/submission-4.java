class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int u = numbers.length-1;
        while(l<u) {
            if(numbers[l]+numbers[u] > target) u--;
            else if(numbers[l]+numbers[u] < target) l++;
            else return new int[] {l+1, u+1};
        }
        return new int[2];
    }
}
