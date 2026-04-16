// Last updated: 16/04/2026, 14:46:05
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int[] prefixSum = new int[nums.length+1];
4        prefixSum[0] = nums[0];
5
6        for(int i = 1; i<=nums.length; i++){
7            prefixSum[i] = prefixSum[i-1]+nums[i-1];
8        }
9
10        int count = 0;
11        for(int  i =0; i< prefixSum.length; i++){
12            for(int j = i+1; j <prefixSum.length; j++){
13                if(prefixSum[j] - prefixSum[i] ==k){
14                    count++;
15                }
16            }
17        }
18    return count;
19    }
20
21}
22
23//[9,11,20,22]
24//[22,13,11,2]