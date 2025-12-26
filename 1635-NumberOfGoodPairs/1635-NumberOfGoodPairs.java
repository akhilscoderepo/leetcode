// Last updated: 26/12/2025, 15:59:30
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int totalPairs=0;
        
        for(int i=0; i<nums.length; i++){
           for(int j=0; j<nums.length; j++){
               if(i!=j){
                   if(nums[i]==nums[j]){
                       totalPairs++;
                   }
               }
           }
            }
        return totalPairs/2;
        }
        
    
}