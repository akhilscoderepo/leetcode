// Last updated: 26/12/2025, 16:01:09
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num <= min){
                min = num;
            }else if(num <= max){
                max = num;
            }else{
                return true;
            }
        }
        
        return false;
    }
}