// Last updated: 04/04/2026, 14:00:48
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> map = new HashMap();
4
5        for(int i = 0; i< nums.length; i++){
6            int diff  = target - nums[i];
7            if(map.containsKey(diff)){
8                return new int[]{i, map.get(diff)};
9            }else{
10                map.put(nums[i], i);
11
12            }
13
14           
15        }
16return null;
17    }
18}