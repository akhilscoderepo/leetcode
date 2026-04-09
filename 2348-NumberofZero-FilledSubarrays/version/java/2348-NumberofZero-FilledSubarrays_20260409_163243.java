// Last updated: 09/04/2026, 16:32:43
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
11                System.out.println(zeros);
12                System.out.println(result);
13                zeros = 0;
14            }
15        }
16
17        if(zeros >0){
18            result += count(zeros);
19        }
20        return result;
21    }
22
23    private long count(long n){
24        return (n*(n+1))/2;
25    }
26}