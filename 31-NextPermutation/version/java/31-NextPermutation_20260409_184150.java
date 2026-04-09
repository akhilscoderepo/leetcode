// Last updated: 09/04/2026, 18:41:50
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length, k = -1, l = -1;
4
5        for(int i = n-2; i>=0; i--){
6            if(nums[i]<nums[i+1]){
7                k = i;
8                break;
9            }
10        }
11
12        if(k == -1){
13            reverse(nums, 0, n-1);
14            return;
15        }else{
16            for(int j = n-1; j>=0; j--){
17                if(nums[j] > nums[k]){
18                    l = j;
19                    break;
20                }
21            }
22            swap(nums, k,l);
23            reverse(nums, k+1, n-1);
24        }
25    }
26
27    private void swap(int[] nums, int i, int j){
28        int temp = nums[i];
29        nums[i] = nums[j];
30        nums[j] = temp;
31    }
32
33    private void reverse(int[] nums, int start, int end){
34        while(end > start){
35            swap(nums, start, end);
36            start++;
37            end--;
38        }
39    }
40}