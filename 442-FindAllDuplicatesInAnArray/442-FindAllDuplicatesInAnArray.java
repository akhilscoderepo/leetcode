// Last updated: 26/12/2025, 16:00:55
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list= new ArrayList<>();
        
        for(int i: nums){
            if(!set.add(i)){
                list.add(i);
            }
        }
        
        return list;
    }
}