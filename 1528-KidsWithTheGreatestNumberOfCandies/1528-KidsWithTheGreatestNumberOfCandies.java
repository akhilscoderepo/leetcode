// Last updated: 26/12/2025, 15:59:39
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();
        boolean isture=false;
        
        for(int i=0; i<candies.length; i++){
            candies[i] += extraCandies;
            for(int j=0; j<candies.length; j++){
                if(candies[i]<candies[j]){
                isture=false;  
                    break;
                }else{
                    isture=true;   
                }
                
            }
             result.add(isture);
            candies[i] -= extraCandies;
        }
        
        return result;
        
    }
}