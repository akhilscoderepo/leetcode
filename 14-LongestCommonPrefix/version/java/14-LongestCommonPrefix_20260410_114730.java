// Last updated: 10/04/2026, 11:47:30
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String f = strs[0], l = strs[strs.length-1];
5        StringBuilder res = new StringBuilder();
6
7        for(int i=0; i<Math.min(f.length(), l.length()); i++){
8            if(f.charAt(i) != l.charAt(i)){
9                return res.toString();
10            }else{
11                res.append(f.charAt(i));
12            }
13        }
14
15        return res.toString();
16    }
17}