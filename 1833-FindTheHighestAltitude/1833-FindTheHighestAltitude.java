// Last updated: 26/12/2025, 15:59:14
class Solution {
    public int largestAltitude(int[] gain) {
        int result[] =new int[101];
        int max=0;
        int number=0;
        
        for(int i=0;i<gain.length;i++){
            number=gain[i]+number;
            max =Math.max(max,number);   
        }
        
       return max;
        
    }
}