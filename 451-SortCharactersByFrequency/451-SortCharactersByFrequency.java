// Last updated: 26/12/2025, 16:00:52
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for(char c: s.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((o1,o2)->o2.getValue()-o1.getValue());
        
        
       pq.addAll(frequencyMap.entrySet());
        
        StringBuilder sb =new StringBuilder();
        
        while(pq.size()>0){
            Map.Entry entry = pq.poll();
            for(int i=0;i<(int)entry.getValue();i++){
                sb.append(entry.getKey());
            }
            
        }
        
        return sb.toString();
        
    }
}

//we can read frequencies based on range and add to map
//iterate the map and directly add key based on value to pq
//convert that to String and return it

//we can read frequencies based on range and add to map
////iterate the map and directly add key based on value to array
//now do a counting sort and build the array again in the required order
//convert array to string and return it
