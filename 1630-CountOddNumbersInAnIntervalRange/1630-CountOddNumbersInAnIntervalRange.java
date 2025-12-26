// Last updated: 26/12/2025, 15:59:29
class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0){
            return (high-low)/2;
        }else{
            return (high-low)/2 +1;
        }
    }
}
