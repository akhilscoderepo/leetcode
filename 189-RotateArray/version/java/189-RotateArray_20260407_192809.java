// Last updated: 07/04/2026, 19:28:09
1class Solution {
2    public void rotate(int[] nums, int k) {
3        k = k%nums.length;
4        Reverse(nums, 0, nums.length-1);
5        Reverse(nums, 0, k-1);
6        Reverse(nums, k, nums.length-1);
7
8    }
9
10        public void Reverse(int[] nums, int s, int e){
11            while (e > s) {
12            int temp = nums[s];
13            nums[s] = nums[e];
14            nums[e] = temp;
15            s++;
16            e--;
17        }
18        }
19    
20}
21
22//[1,2,3,4] - k =1
23//[4,3,2,1]
24//[4,1,2,3]