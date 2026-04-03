// Last updated: 03/04/2026, 17:03:50
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split("\\s+");
4        StringBuilder sb = new StringBuilder();
5        
6        for(int i = words.length-1; i >= 0; i--){
7            String word = words[i].trim(); 
8            if(word != " "){
9                sb.append(word);
10                if(i!=0){
11                    sb.append(" ");
12                }
13            }
14            
15        }
16
17        return sb.toString().trim();
18    }
19}