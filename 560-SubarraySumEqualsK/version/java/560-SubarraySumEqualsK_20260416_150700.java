// Last updated: 16/04/2026, 15:07:00
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3       Map<Integer, Integer> map = new HashMap();
4        map.put(0,1);
5        int currentPreFixSum = 0, result = 0;
6
7        for(int n : nums){
8            currentPreFixSum += n;
9            if(map.containsKey(currentPreFixSum - k)){
10                result += map.get(currentPreFixSum - k);
11            }
12            map.put(currentPreFixSum, map.getOrDefault(currentPreFixSum, 0)+1);
13        }
14
15    return result;
16    }
17
18}
19
20//create a map with inital value as 0-1 to avoid sum of current array being subarray
21//iterate over nums and find currentPrefixSum, if currentprefixsum-k is present in map means we have seen that prefix sum n times
22//so add that to result else just update map