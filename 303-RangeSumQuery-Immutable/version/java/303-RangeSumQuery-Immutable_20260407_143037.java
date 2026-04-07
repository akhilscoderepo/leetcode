// Last updated: 07/04/2026, 14:30:37
1class NumArray {
2
3    int[] globalNums;
4
5    public NumArray(int[] nums) {
6        globalNums = nums;
7    }
8    
9    public int sumRange(int left, int right) {
10        int result = 0;
11
12        for(int i = left; i < right+1; i++){
13            result += globalNums[i];
14        }
15
16        return result;
17    }
18}
19
20/**
21 * Your NumArray object will be instantiated and called as such:
22 * NumArray obj = new NumArray(nums);
23 * int param_1 = obj.sumRange(left,right);
24 */