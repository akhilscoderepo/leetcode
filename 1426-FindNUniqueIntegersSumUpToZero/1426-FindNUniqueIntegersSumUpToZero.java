// Last updated: 26/12/2025, 15:59:53
class Solution {
    public int[] sumZero(int n) {
       int result[] = new int[n];
        int start=0;
        int end=n-1;
        int i=n/2;
        
        while(start<end){
            result[start]=i;
            result[end]=-i;
            --i;
            start++;
            end--;
        }
        
        
                
      
        
      return result;  
        
    }
}

// if(n%2==0){
//             while(){
//                 result[start]
//             }
//         }else{
//         while(mid-i>=0 && mid+i<n){
//             result[mid-i]=i;
//             result[mid+i]=-i;
//             i++;
//         }
        
    
//         }



