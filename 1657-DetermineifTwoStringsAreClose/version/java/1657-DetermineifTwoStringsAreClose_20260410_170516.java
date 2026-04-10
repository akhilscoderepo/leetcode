// Last updated: 10/04/2026, 17:05:16
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int[] bucket1 = new int[26];
4        int[] bucket2 = new int[26];
5
6        for(int  i =0; i< word1.length(); i++){
7            bucket1[word1.charAt(i)-'a']++;
8        }
9
10        for(int  j =0; j< word2.length(); j++){
11            bucket2[word2.charAt(j)-'a']++;
12        }
13
14        for(int i =0; i<26; i++){
15            if((bucket1[i]>0 && bucket2[i] ==0) ||(bucket2[i]>0 && bucket1[i] ==0)){
16                return false;
17            }
18        }
19
20        Arrays.sort(bucket1);
21        Arrays.sort(bucket2);
22
23        for(int i =0; i<26; i++){
24            if(bucket1[i]!=bucket2[i]){
25                return false;
26            }
27        }
28
29        return true;
30    }
31}