// Last updated: 26/12/2025, 16:01:52
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for(int a : nums){
            result^=a;
        }
        
        return result;
    }
}