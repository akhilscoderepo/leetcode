// Last updated: 26/12/2025, 16:00:31
class Solution {
    public String reorganizeString(String s) {
          
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()) 
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        PriorityQueue<Character> heap = new PriorityQueue<>(
            (key1, key2) -> map.get(key2) - map.get(key1));
        
        for(char c : map.keySet())
            heap.add(c);

        int val1 = 0;
        int val2 = 0;
        
        while(heap.size() > 1) {
            
            char c1 = heap.remove();
            char c2 = heap.remove();
            res.append(c1);
            res.append(c2);
                
            map.put(c1, map.get(c1) - 1);
            map.put(c2, map.get(c2) - 1);
            
            if(map.get(c1) > 0) heap.add(c1);
            if(map.get(c2) > 0) heap.add(c2);
              
        }
        
        if(!heap.isEmpty()) {
            if(map.get(heap.peek()) > 1) return "";
            else
               res.append(heap.remove());
               
        } 
    
        return res.toString();
    }
}

//first approach-used  Map.Entry, but found that we can just add all chars in desc order instead
// HashMap<Character, Integer> map = new HashMap<>();
        
//         for(char c: s.toCharArray()){
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((e,f)->f.getValue()-e.getValue());
        
//         StringBuffer sb = new StringBuffer(s.length());
        
//         for(Map.Entry<Character, Integer> entry: map.entrySet()){
//             pq.add(entry);
//         }
       
//         int index=0;
        
//         while(!pq.isEmpty()){
//             Map.Entry entry=pq.poll();
//             int count=(int)entry.getValue();
//             int shift=count;
//             char c=(char)entry.getKey();
//             while(count>0){
//                 //figure out a way to fix index
//                 if(sb.indexOf(String.valueOf(c))!=-1){
//                     int lastIndex = sb.lastIndexOf(String.valueOf(c));
//                     sb.insert(lastIndex+shift,c);
//                     count--;
//                 }else{
//                     sb.insert(index,c);
//                     index++;
//                     count--;
                    
//                 }
                
//             }
            
//         }
//         //also need to make sure no char reeapts
//         // if(sb.length()<s.length()){
//         //     return "";
//         // }
//          return sb.toString();

