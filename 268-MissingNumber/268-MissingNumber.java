// Last updated: 26/12/2025, 16:01:10
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNums = (n * (n+1))/2;
        int actualSum = Arrays.stream(nums).sum();
        return sumOfNums-actualSum;
    }
}