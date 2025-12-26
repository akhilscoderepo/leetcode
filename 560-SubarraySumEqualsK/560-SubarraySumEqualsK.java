// Last updated: 26/12/2025, 16:00:46
class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0, result=0;
        
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            result += map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return result;
    }
}