// Last updated: 10/04/2026, 11:36:21
1class Solution {
2    public boolean validPalindrome(String s) {
3        int start = 0, end = s.length()-1;
4
5        while(end > start){
6            if(s.charAt(start) == s.charAt(end)){
7                start++;
8                end--;
9            }
10            else{
11                return isPalindrome(s, start+1, end) || isPalindrome(s,start, end-1);
12            }
13        }
14        return true;
15    }
16
17    private boolean isPalindrome(String s, int i, int j){
18        while(i <= j){
19            if(s.charAt(i) == s.charAt(j)){
20                i++;
21                j--;
22            }else{
23                return false;
24            }
25        }
26        return true;
27    }
28}