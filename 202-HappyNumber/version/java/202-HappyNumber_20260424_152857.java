// Last updated: 24/04/2026, 15:28:57
1class Solution {
2    public boolean isHappy(int n) {
3        int slow = nextNum(n);
4        int fast = nextNum(nextNum(n));
5
6        while(slow != fast){
7            if(fast ==1)return true;
8            slow = nextNum(slow);
9            fast = nextNum(nextNum(fast));
10        }
11
12        return slow ==1;
13    }
14
15    private int nextNum(int n){
16        int op = 0;
17
18        while(n >0){
19            int rem = n%10;
20            op += rem*rem;
21            n = n/10;
22        }
23
24        return op;
25    }
26}