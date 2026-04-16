// Last updated: 16/04/2026, 10:40:19
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int  i =0, n = numbers.length, j = n-1;
4
5        while(j>i){
6            int end = numbers[j];
7            int start = numbers[i];
8            int sum = end+start;
9            int diff = sum-target;
10
11            if(diff >0){
12                j--;
13            }else if(diff < 0){
14                i++;
15            }else if(diff == 0){
16                return new int[]{i+1,j+1};
17            }
18        }
19        return null;
20    }
21}