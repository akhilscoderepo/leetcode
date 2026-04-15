// Last updated: 15/04/2026, 19:56:30
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] bucket = new int[26];
4
5        for(char c : s.toCharArray()){
6            bucket[c-'a']++; 
7        }
8
9       for(int  i =0; i< s.length(); i++){
10        if(bucket[s.charAt(i)-'a'] ==1){
11            return i;
12        }
13       }
14
15        return -1;
16    }
17 }