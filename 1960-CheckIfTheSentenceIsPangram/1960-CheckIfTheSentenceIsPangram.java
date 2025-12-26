// Last updated: 26/12/2025, 15:59:00
class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length()<26) return false;
     for(int i=1; i<=26;i++){
         if(sentence.indexOf((char)i+96)<0){
             
             return false;
         }
             
             
         }
     return true;
    }
}