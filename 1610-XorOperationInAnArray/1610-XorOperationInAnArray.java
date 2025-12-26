// Last updated: 26/12/2025, 15:59:31
class Solution {
    public int xorOperation(int n, int start) {
        int result=start;
        for(int i=1;i<n;i++){
            result^=(start+2*i);
        }
        
        return result;
    }
}

