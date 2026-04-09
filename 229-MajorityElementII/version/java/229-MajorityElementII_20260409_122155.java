// Last updated: 09/04/2026, 12:21:55
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3       HashMap<Integer, Integer> map = new HashMap();
4        int length = nums.length;
5
6       for(int n: nums){
7        map.put(n, map.getOrDefault(n,0)+1);
8       }
9
10        List<Integer> result = new ArrayList();
11        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
12            if(entry.getValue() > length/3){
13                result.add(entry.getKey());
14             }
15        }
16    return result;
17    }
18}