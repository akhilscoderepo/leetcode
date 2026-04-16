// Last updated: 16/04/2026, 16:15:27
1class Solution {
2    public int findMaxLength(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap();
4        map.put(0,-1);
5        int ones = 0, zeros = 0, length = 0;
6        int index = 0;
7
8        for(int n : nums){
9           if(n == 0) zeros++;
10           else ones++;
11           int diff = zeros- ones;
12
13           if(map.containsKey(diff)){
14            length = Math.max(length, index-map.get(diff));
15           }else{
16            map.put(diff, index);
17           }
18           index++;
19        }
20        return length;
21    }
22}
23//[0,0,1,1,1,1,0]
24