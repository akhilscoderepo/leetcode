// Last updated: 16/04/2026, 11:55:06
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> result = new ArrayList();
5
6        for(int i =0; i< nums.length; i++){
7            if(i> 0 && nums[i] == nums[i-1]) continue;
8
9            int j = i+1;
10            int k = nums.length - 1;
11
12            while(k > j){
13                int sum =  nums[i]+nums[j]+nums[k];
14
15                if(sum !=0){
16                    if(sum > 0){
17                        k--;
18                    }else if(sum <0){
19                        j++;
20                    }
21                }else{
22                    List<Integer> local = new ArrayList();
23                    local.add(nums[i]);
24                    local.add(nums[j]);
25                    local.add(nums[k]);
26                    result.add(local);
27                    j++;
28                    
29                    while(nums[j] == nums[j-1] && j < k){
30                        j++;
31                    }
32                }
33            }
34        }
35
36        return result;
37    }
38
39
40}
41
42//[-4,-1,-1,0,1,2]
43//[-3,0,1,2]