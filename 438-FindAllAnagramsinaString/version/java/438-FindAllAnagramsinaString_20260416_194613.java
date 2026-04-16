// Last updated: 16/04/2026, 19:46:13
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3      ArrayList<Integer> ans= new ArrayList<>();
4        int pfreq []=new int [256];
5        int sfreq []=new int [256];
6        int left=0;
7        int len=0;
8
9        for(int i=0;i<p.length();i++){
10          pfreq[p.charAt(i)]++;
11        }  
12        for(int right=0;right<s.length();right++){
13          sfreq[s.charAt(right)]++;
14          len= right-left+1;
15
16          while(len > p.length()){
17            sfreq[s.charAt(left)]--;
18            left++;
19            len = right-left+1;
20          }
21          if(helper(sfreq,pfreq)){
22            ans.add(left);
23          }
24        }
25        return ans;
26    }
27
28    public boolean helper(int []sfreq , int pfreq[]){
29      for(int i=0;i<256;i++){
30        if(pfreq[i]!=sfreq[i]){
31          return false;
32        }
33      }
34      return true;
35    }
36    
37}