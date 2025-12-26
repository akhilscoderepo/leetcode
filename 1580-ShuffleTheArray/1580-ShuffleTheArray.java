// Last updated: 26/12/2025, 15:59:35
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[2*n];
                
        for(int i=0; i<n; i++){
            result[i*2]=nums[i];
            result[2*i+1]=nums[n+i];
        }
        
        return result;
    }
}