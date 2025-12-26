// Last updated: 26/12/2025, 16:00:13
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return i;
            }
        }
        
        return -1;
    }
}