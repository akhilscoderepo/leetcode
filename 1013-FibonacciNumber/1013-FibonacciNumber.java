// Last updated: 23/04/2026, 17:59:47
class Solution {
    public int fib(int n) {
        if(n == 1) return 1;
         int prev = 0, prev2 =1;
        int result = 0;
         for(int i = 2; i<=n; i++){
            result = prev + prev2;
            prev = prev2;
            prev2 = result;
         }

         return result;
    }
}