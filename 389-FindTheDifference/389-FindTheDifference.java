// Last updated: 26/12/2025, 16:00:56
class Solution {
    public char findTheDifference(String s, String t) {     
       char[] all = s.concat(t).toCharArray();
        char result=0;
        
        for(char c: all){
            result^=c;
        }
        return result;
    }
}