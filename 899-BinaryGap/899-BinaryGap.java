// Last updated: 26/12/2025, 16:00:20
class Solution {
    public int binaryGap(int n) {
        int first=-1;
        int count=0;
        
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                if(first!=-1){
                    count=Math.max(count,i-first);
                }
                first=i;
            }
        }
        return count;
        
        
    }
}
