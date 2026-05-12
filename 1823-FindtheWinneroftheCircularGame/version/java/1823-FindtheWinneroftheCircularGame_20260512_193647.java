// Last updated: 12/05/2026, 19:36:47
1class Solution {
2    public int findTheWinner(int n, int k) {
3      return helper(n,k)+1;
4    }
5
6    private int helper(int n, int k){
7        if(n == 1){
8            return 0;
9        }else{
10            return (helper(n-1,k)+k)%n;
11        }
12    }
13}