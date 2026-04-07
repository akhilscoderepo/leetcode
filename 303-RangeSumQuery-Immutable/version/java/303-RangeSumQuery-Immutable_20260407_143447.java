// Last updated: 07/04/2026, 14:34:47
1class NumArray {
2
3    int[] globalNums;
4
5    public NumArray(int[] nums) {
6        globalNums = new int[nums.length+1];
7        for(int i = 0; i< nums.length; i++){
8            globalNums[i+1] += globalNums[i] +nums[i];
9        }
10    }
11    
12    public int sumRange(int left, int right) {
13       return globalNums[right+1] -globalNums[left];
14    }
15}
16
17/**
18 * Your NumArray object will be instantiated and called as such:
19 * NumArray obj = new NumArray(nums);
20 * int param_1 = obj.sumRange(left,right);
21 */