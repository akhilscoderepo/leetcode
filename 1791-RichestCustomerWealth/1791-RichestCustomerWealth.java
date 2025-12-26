// Last updated: 26/12/2025, 15:59:19
class Solution {
    public int maximumWealth(int[][] accounts) {
       int length=accounts.length;
        int output=0;
        
        
        for(int i=0; i<length; i++){
            int maxWealth=0;
            for(int j=0; j<accounts[i].length; j++){
                maxWealth += accounts[i][j];        
            }  
            
            output = Math.max(output,maxWealth);
        }
        
       return output;
        
    }
}