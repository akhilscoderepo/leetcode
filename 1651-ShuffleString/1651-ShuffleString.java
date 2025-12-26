// Last updated: 26/12/2025, 15:59:26
class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder op = new StringBuilder(s);
       
      
        
        for(int i=0;i<indices.length;i++){
            op.replace(indices[i],indices[i]+1,String.valueOf(s.charAt(i)));
           
        }
        
        return op.toString();
    }
}