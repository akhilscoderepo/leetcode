// Last updated: 26/12/2025, 16:02:29
class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0,o=x;
        
        while(o>0){
            reverse = (reverse*10)+(o%10);
            o=o/10;
        }
        System.out.print(reverse);
        
        return reverse==x;
    }
}