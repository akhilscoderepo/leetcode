// Last updated: 26/12/2025, 16:02:13
class Solution {
    public int lengthOfLastWord(String s) {
        if(!s.contains(" "))return s.length();
        
        s=s.trim();
        
        int size = s.split(" ").length;
        return s.split(" ")[size-1].length();
        
               
    }
}