// Last updated: 26/12/2025, 15:59:05
class Solution {
    public String truncateSentence(String s, int k) {
        String result="";
        if(s.length()<k){
            return s;
        }
        
        String[] array = s.split(" ");
        
       for(int i=0; i<k;i++){
           result +=array[i]+" ";
       }
        return result.trim();
    }
}