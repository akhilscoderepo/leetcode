// Last updated: 14/04/2026, 20:43:05
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3       Map<Integer, Integer> map = new HashMap();
4
5       for(int  i = 0; i < nums.length; i++){
6        int previous = map.getOrDefault(nums[i], -1);
7        int current = i;
8        if(previous >=0 && current-previous <=k){
9            return true;
10        }
11        map.put(nums[i], i);
12       }
13
14       return false;
15    }
16}
17
18//[1,5,3,2,5,4] k =5
19