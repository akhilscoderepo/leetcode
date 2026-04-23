// Last updated: 23/04/2026, 17:59:17
class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] bucket1 = new int[26];
        int[] bucket2 = new int[26];

        for(int  i =0; i< word1.length(); i++){
            bucket1[word1.charAt(i)-'a']++;
        }

        for(int  j =0; j< word2.length(); j++){
            bucket2[word2.charAt(j)-'a']++;
        }

        for(int i =0; i<26; i++){
            if((bucket1[i]>0 && bucket2[i] ==0) ||(bucket2[i]>0 && bucket1[i] ==0)){
                return false;
            }
        }

        Arrays.sort(bucket1);
        Arrays.sort(bucket2);

        for(int i =0; i<26; i++){
            if(bucket1[i]!=bucket2[i]){
                return false;
            }
        }

        return true;
    }
}