// Last updated: 26/12/2025, 16:01:05
class Solution {
    public boolean isPowerOfFour(int n) {
        double log = (Math.log(n)/Math.log(4));
        return log%1==0;
        
    }
}

