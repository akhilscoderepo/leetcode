// Last updated: 17/04/2026, 14:59:42
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int count =0, start= 0, end= 0;
4
5        while(end < s.length()){
6            boolean isUniqueSubString = hasUniqueOnly(s.substring(start, end+1));
7            
8            if(!isUniqueSubString){
9                start++;
10            }
11        
12            if(isUniqueSubString){
13                count = Math.max(count, end-start+1);
14                end++;
15            }
16        }
17
18        return count;
19    }
20
21    private boolean hasUniqueOnly(String input){
22        HashSet<Character> set = new HashSet();
23
24        for(char c: input.toCharArray()){
25            if(set.contains(c)){
26                return false;
27            }
28            set.add(c);
29        }
30
31        return true;
32    }
33}