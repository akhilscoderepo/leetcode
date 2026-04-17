// Last updated: 17/04/2026, 17:55:34
1class Solution {
2    public int maxProduct(int[] nums) {
3       int sum =1, max = Integer.MIN_VALUE;
4
5       for(int i = 0; i< nums.length; i++){
6        sum *= nums[i];
7        max = Math.max(sum, max);
8        if(sum ==0){
9            sum =1;
10        }
11       }
12       sum =1;
13       for(int i =nums.length-1; i>=0; i--){
14        sum*=nums[i];
15        max = Math.max(sum, max);
16        if(sum ==0){
17            sum=1;
18        }
19       }
20       return max;
21    }
22}