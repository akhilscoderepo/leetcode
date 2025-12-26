// Last updated: 26/12/2025, 16:00:47
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int size= score.length;
      int[][] pair = new int[size][2];  
        
        for(int i=0;i<size;i++){
            pair[i][0]=score[i];
            pair[i][1]=i;
        }
        
        Arrays.sort(pair,(a,b)->(b[0]-a[0]));
        String[] result = new String[size];
        
        for(int j=0;j<size;j++){
            if(j==0){
            result[pair[j][1]] ="Gold Medal";      
            }else if(j==1){
                result[pair[j][1]] ="Silver Medal";      
            } else if(j==2){
                result[pair[j][1]] ="Bronze Medal";      
            }else{
                result[pair[j][1]] =j+1+"";      
            }
          
        }
        
      return result;  
    }
}

//heap=3,4,8,9,10
//ans=3,5, 4,4, 8,3, 9,2, 10,1
//replace socre array

//better idea
//sort it in desc/asc order a new array
//put ans in new string array based on position of int in score using chatAt

