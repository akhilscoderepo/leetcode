// Last updated: 09/04/2026, 15:49:12
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        //put data in map
4        //refill the data back into original array
5
6        //two pointer
7
8        int i = 2;
9
10        for(int j = 2; j< nums.length; j++){
11            if(nums[j] != nums[i-2]){
12                nums[i] = nums[j];
13                i++;
14            }
15         
16        }
17    return i;
18    }
19}