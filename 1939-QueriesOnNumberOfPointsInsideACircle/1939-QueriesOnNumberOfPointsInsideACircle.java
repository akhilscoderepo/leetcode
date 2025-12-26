// Last updated: 26/12/2025, 15:59:07
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
       
        
        for(int k=0;k<queries.length;k++){
                for(int i=0;i<points.length;i++){
                    
                int d= (int)Math.pow((points[i][0]-queries[k][0]),2)+(int)Math.pow((points[i][1]-queries[k][1]),2);
                    if(d<=(int)Math.pow(queries[k][2],2)){
                        ans[k]+=1;
                    }
                            

                

        }    
        }
        return ans;
        
    }
}