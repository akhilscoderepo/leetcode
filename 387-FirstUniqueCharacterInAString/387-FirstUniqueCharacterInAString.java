// Last updated: 26/12/2025, 16:00:57
class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();   
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);    
            }else{
                charMap.put(c,1);    
            }
            
        }
        
        for(char c : charMap.keySet()){
            if(charMap.get(c)==1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
//TLE

// List<Integer> skipIndex = new ArrayList<Integer>();
        
//        for(int i=0;i<s.length();i++){
//            int index=s.indexOf(s.charAt(i),i+1);
//           if(!skipIndex.contains(i) && index==-1){
//               return i;
//           } 
//            skipIndex.add(index);
//        } 
//         return -1;