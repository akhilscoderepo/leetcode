// Last updated: 03/04/2026, 12:52:12
1class Solution {
2    public int thirdMax(int[] nums) {
3        // Three variables to store maxiumum three numbers till now.
4        long firstMax = Long.MIN_VALUE;
5        long secondMax = Long.MIN_VALUE;
6        long thirdMax = Long.MIN_VALUE;
7        
8        for (int num : nums) {
9            // This number is already used once, thus we skip it.
10            if (firstMax == num || secondMax == num || thirdMax == num) {
11                continue;
12            }
13            
14            // If current number is greater than first maximum,
15            // It means that this is the greatest number and first maximum and second max
16            // will become the next two greater numbers.
17            if (firstMax <= num) {
18                thirdMax = secondMax;
19                secondMax = firstMax;
20                firstMax = num;
21            }
22            // When current number is greater than second maximum,
23            // it means that this is the second greatest number.
24            else if (secondMax <= num) {
25                thirdMax = secondMax;
26                secondMax = num;
27            }
28            // It is the third greatest number.
29            else if (thirdMax <= num) {
30                thirdMax = num;
31            }
32        }
33        
34        // If third max was never updated, it means we don't have 3 distinct numbers.
35        if (thirdMax == Long.MIN_VALUE) {
36            int ans = (int) firstMax;
37            return ans;
38        }
39        
40        int ans = (int) thirdMax;
41        return ans;
42    }
43}