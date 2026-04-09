// Last updated: 09/04/2026, 16:32:57
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        long zeros = 0;
4        long result = 0;
5
6        for(int  i =0; i< nums.length; i++){
7            if(nums[i] == 0){
8                zeros++;
9            }else if(nums[i] != 0){
10                result +=  count(zeros);
11                zeros = 0;
12            }
13        }
14
15        if(zeros >0){
16            result += count(zeros);
17        }
18        return result;
19    }
20
21    private long count(long n){
22        return (n*(n+1))/2;
23    }
24}