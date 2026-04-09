// Last updated: 09/04/2026, 18:07:17
1class Solution {
2    public boolean increasingTriplet(int[] nums) {
3        if(nums.length < 3) return false;
4
5        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
6
7        for(int n : nums){
8            if(n <= first){
9                first  = n;
10            }else if(n <= second){
11                second  = n;
12            }else{
13                return true;
14            }            
15        }
16
17
18        return false;
19    }
20}