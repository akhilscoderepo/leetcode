// Last updated: 26/12/2025, 15:59:21
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "", secondWord ="";
        
        for(String s: word1){
            firstWord +=s;
        }
        
        for(String s: word2){
            secondWord +=s;
        }
        
        return firstWord.equals(secondWord);
    }
}