// Last updated: 26/12/2025, 16:01:57
class Solution {
    public boolean isPalindrome(String s) {        
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
       
        return s.equals(String.valueOf(new StringBuilder(s).reverse()));
    }
}