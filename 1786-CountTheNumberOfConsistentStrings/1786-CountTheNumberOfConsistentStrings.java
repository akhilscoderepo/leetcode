// Last updated: 26/12/2025, 15:59:20
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int match =words.length;
        
         for(String item : words){
        for(int i=0; i<item.length();i++){
            if(!allowed.contains(String.valueOf(item.charAt(i)))){
                --match;
                break;
            }

        }
    }
    return match; 
    }
}
       