// Last updated: 26/12/2025, 16:01:30
class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> input = new HashSet();
        
        for(int i: nums){
            input.add(i);
        }
        
        return (input.size()==nums.length)?false:true;
    }
}