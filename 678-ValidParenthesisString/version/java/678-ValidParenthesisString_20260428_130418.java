// Last updated: 28/04/2026, 13:04:18
1class Solution {
2    public boolean checkValidString(String s) {
3       int high = 0, low = 0;
4
5       for(char c : s.toCharArray()){
6            if(c == '('){
7                low++;
8                high++;
9            }else if( c == ')'){
10                low--;
11                high--;
12            }else{
13                low--;
14                high++;
15            }
16
17            if(high <0) return false;
18            if(low < 0) low =0;
19       }
20
21       return low ==0;
22    }
23}