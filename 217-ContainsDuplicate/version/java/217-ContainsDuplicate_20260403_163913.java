// Last updated: 03/04/2026, 16:39:13
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3       Set<Integer> set = new HashSet();
4
5       for(int n : nums){
6        set.add(n);
7       }
8
9       return set.size() != nums.length;
10    }
11}