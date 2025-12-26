// Last updated: 26/12/2025, 15:59:50
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int length=queries.length;
        int arLength = arr.length;
        int result[] = new int[length];
        int prefix[] = new int[arLength];
        prefix[0]=arr[0];
        
        for(int i=1;i<arLength;i++){
            prefix[i]^=prefix[i-1]^arr[i];
        }
       
      
            for(int j=0;j<length;j++){
                int left = queries[j][0];
                int right = queries[j][1];
                if(left==0){
                    result[j]=prefix[right];
                }else{
                    result[j]=prefix[right]^prefix[left-1];
                }
            }
            
       
        
        return result;
    }
}

//Time-O(n2) for 2 loops
//Space-O(n)

//if prefix isued O(n)

//xor 1 xor 1,3 xor 134 xor 1348