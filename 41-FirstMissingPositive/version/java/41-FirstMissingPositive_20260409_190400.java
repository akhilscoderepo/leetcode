// Last updated: 09/04/2026, 19:04:00
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3         Set<Integer> set = new HashSet<>();
4    for (int n : nums) {
5        if (n > 0) set.add(n);
6    }
7
8    int i = 1;
9    // Simply count up until you find a number not in the set
10    while (set.contains(i)) {
11        i++;
12    }
13    
14    return i;
15    }
16}