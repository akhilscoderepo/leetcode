// Last updated: 26/12/2025, 15:59:08
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0)+coordinates.charAt(1))%2==1);
        
    }
}