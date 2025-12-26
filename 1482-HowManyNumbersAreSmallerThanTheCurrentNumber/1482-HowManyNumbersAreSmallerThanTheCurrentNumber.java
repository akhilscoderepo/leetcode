// Last updated: 26/12/2025, 15:59:43
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int op[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j< nums.length; j++){
                if(nums[i]>nums[j]){
                    op[i]+=1;
                }
            }
        }
        return op;
    }
}