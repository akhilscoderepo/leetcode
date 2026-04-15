// Last updated: 15/04/2026, 20:05:56
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3       HashMap<Integer, Integer> map = new HashMap();
4
5       for(int i = 0; i< nums.length; i++){
6        
7
8        if(map.containsKey(target-nums[i])){
9            return new int[]{map.get(target-nums[i]),i};
10        }else{
11            map.put(nums[i], i);
12        }
13       }
14return null;
15   
16    }
17}