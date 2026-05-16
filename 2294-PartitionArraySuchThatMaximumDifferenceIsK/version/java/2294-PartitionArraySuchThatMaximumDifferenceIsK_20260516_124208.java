// Last updated: 16/05/2026, 12:42:08
1class Solution {
2    // public int partitionArray(int[] nums, int k) {
3    //     Arrays.sort(nums);
4    //     int left = 0;
5    //     int result = 1;
6
7    //    for(int right=1; right < nums.length; ++right){
8    //     if(nums[right] -nums[left] >k){
9    //         result++;
10    //         left = right;
11    //     }
12    //    }
13
14    //    return result;
15
16       
17    // }
18
19        public int partitionArray(int[] A, int k) {
20        Arrays.sort(A);
21        int res = 1, mn = A[0], mx = A[0];
22        for (int a: A) {
23            mn = Math.min(mn, a);
24            mx = Math.max(mx, a);
25            if (mx - mn > k) {
26                res++;
27                mn = mx = a;
28            }
29        }
30        return res;
31    }
32}