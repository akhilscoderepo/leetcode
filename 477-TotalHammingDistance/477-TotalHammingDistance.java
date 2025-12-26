// Last updated: 26/12/2025, 16:00:50
class Solution {
    public int totalHammingDistance(int[] nums) {
       int count=0,n=nums.length;
        
        for(int i=0;i<32;i++){
            int bitCount=0;
            for(int j=0;j<n;j++){
                bitCount+=(nums[j]>>i)&1;
            }
            count+=bitCount*(n-bitCount);
        }
        
        return count;
    }
}


 // int total = 0, n = nums.length;
 //    for (int j=0;j<32;j++) {
 //        int bitCount = 0;
 //        for (int i=0;i<n;i++) 
 //            bitCount += (nums[i] >> j) & 1;
 //        total += bitCount*(n - bitCount);
 //    }
 //    return total;



