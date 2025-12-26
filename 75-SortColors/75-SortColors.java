// Last updated: 26/12/2025, 16:02:09
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0; int two = nums.length-1; int index=0;
        
        while(index<=two){
            if(nums[index] == 0){
                swap(nums, zero, index++);
                zero++;
            }else if(nums[index] == 2){
                swap(nums, two, index);
                two--;
            }else{
                index++;    
            }   
        }
        
    }
    
    private void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        
    }
}

//  int count[] = new int[3];
        
//         for(int num : nums){
//             if(num == 0){
//                 count[0]++;
//             }else if(num == 1){
//                 count[1]++;
//             }else{
//                 count[2]++;
//             }
//         }
        
//         int iter = 0;
        
//         for(int i=0; i<count.length; i++){
//             while(count[i]>0){
//                 nums[iter++] = i;
//                 --count[i];
//             }
//         }