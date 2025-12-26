// Last updated: 26/12/2025, 16:02:18
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0 && needle.length()==0)return 0;
        
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        
        return -1;
    }
}