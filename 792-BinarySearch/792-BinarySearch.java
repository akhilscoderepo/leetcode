// Last updated: 26/12/2025, 16:00:26
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            return nums[0]==target?0:-1;
        }
        
        if(nums.length%2==0){
            for(int i=0; i<nums.length/2;i++){
            if(nums[i]==target){
                return i;
            }else if (nums[nums.length-1-i]==target){
               return nums.length-1-i; 
            }
        }
        }else{
             for(int i=0; i<nums.length/2+1;i++){
            if(nums[i]==target){
                return i;
            }else if (nums[nums.length-1-i]==target){
               return nums.length-1-i; 
            }
        }
        }
        
        
        return -1;
    }
}