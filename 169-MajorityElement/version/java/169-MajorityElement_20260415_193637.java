// Last updated: 15/04/2026, 19:36:37
1class Solution {
2    public int majorityElement(int[] nums) {
3      HashMap<Integer, Integer> map = new HashMap();
4
5      for(int n : nums){
6        map.put(n, map.getOrDefault(n, 0)+1);
7      }
8
9      int length = nums.length;
10
11      for(Map.Entry<Integer, Integer> entry : map.entrySet()){
12        if(entry.getValue() > length/2){
13            return entry.getKey();
14        }
15      }
16      return -1;
17    }
18}
19
20