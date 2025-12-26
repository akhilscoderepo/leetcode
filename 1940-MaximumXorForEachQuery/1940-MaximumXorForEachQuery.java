// Last updated: 26/12/2025, 15:59:06
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
       int result[] = new int[nums.length];
       int max = (int)Math.pow(2,maximumBit)-1;
        int xorAll=0;
        
        for(int n:nums){
            xorAll^=n;
        }
        
        for(int i=0;i<nums.length;i++){
            result[i]^=max^xorAll;
            xorAll^=nums[nums.length-i-1];
        }
        
        
        return result;
    }
}

//find max from array, sort and get last value
//xor all numbers includin max
//set that xor number to result array

//time-o(n2)
//spac-o(n)

// array = 0
// max=0



