// Last updated: 04/05/2026, 20:35:29
1class Solution {
2    private int[] findNSE(int[] arr) {
3        int n = arr.length;
4        int[] ans = new int[n];
5        Stack<Integer> st = new Stack<>();
6
7        for (int i = n - 1; i >= 0; i--) {
8            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
9                st.pop();
10            }
11
12            ans[i] = !st.isEmpty() ? st.peek() : n;
13
14            st.push(i);
15        }
16
17        return ans;
18    }
19
20    private int[] findPSEE(int[] arr) {
21        int n = arr.length;
22        int[] ans = new int[n];
23        Stack<Integer> st = new Stack<>();
24
25        for (int i = 0; i < n; i++) {
26            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
27                st.pop();
28            }
29
30            ans[i] = !st.isEmpty() ? st.peek() : -1;
31
32            st.push(i);
33        }
34
35        return ans;
36    }
37
38    public int sumSubarrayMins(int[] arr) {
39        int n = arr.length;
40
41        int[] nse = findNSE(arr);
42        int[] psee = findPSEE(arr);
43
44        int mod = (int)1e9 + 7;
45        int sum = 0;
46
47        for (int i = 0; i < n; i++) {
48            int left = i - psee[i];
49
50            int right = nse[i] - i;
51
52            long freq = left * right * 1L;
53
54            int val = (int)((freq * arr[i]) % mod);
55
56            sum = (sum + val) % mod;
57        }
58
59        return sum;
60    }
61}
62
63
64