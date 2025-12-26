// Last updated: 26/12/2025, 15:59:15
class Solution {
    public boolean halvesAreAlike(String s) {
        int leftVowels = 0, rightVowels = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(i<s.length()/2){
                if(String.valueOf(s.charAt(i)).matches("[aeiouAIEOU]")){
                    ++leftVowels;
                }
            }else{
                if(String.valueOf(s.charAt(i)).matches("[aeiouAEIOU]")){
                    ++rightVowels;
                }
            }
        }
        return rightVowels==leftVowels;
    }
        
}
    
    
    