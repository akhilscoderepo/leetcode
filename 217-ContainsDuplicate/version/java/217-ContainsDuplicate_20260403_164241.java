// Last updated: 03/04/2026, 16:42:41
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet s = new HashSet();
        for(int i=0;i<nums.length;i++){
        if(!s.add(nums[i]))
        return true;}
        return false;
    }
}