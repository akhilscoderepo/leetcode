// Last updated: 26/12/2025, 16:00:51
class Solution {
    public int findComplement(int num) {
        int digits = 0;
        int temp=num;
        while(temp>0){
            temp>>=1;
            digits++;
        }
        
        int mask = (1<<digits)-1;
        
        return num^mask;
    }
}



